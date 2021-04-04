package com.dsabasics.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;



/**
 * 
 * @author Emmanuel
 *
 */
public class TestJsonArray {
	
	
	public static void main(String[] args)  {
		TestJsonArray valueJsonArray = new TestJsonArray();
		valueJsonArray.handleJSONArray();	       
	}
	public void handleJSONArray() {
		
		try {
			
			String [] jsonKeys = {"task_.no:","status:","task_summary:","key:"}; //keep in application.properties and same response 
			List<String> list = new LinkedList<String>();
			List<Map> jsonKeyList = new  ArrayList<Map>();
			Map<String,Object> map = new LinkedHashMap<String,Object>(); 		
			String value = "{task_.no:db,status:open,task_summary:citrix app,DB App,key:a},"
					+ "{task_.no:db1,status:open1,task_summary:citrix app1,DB App1,key:a},"
					+ "{task_.no:db2,status:open2,task_summary:citrix app2,DB App2,key:a},"
					+ "{task_.no:db3,status:open3,task_summary:citrix app3,DB App3,key:a}";
			
			value= value.replaceAll("[}]", "##");
			value =value.replace(",{", "");
			value =value.replace(", {", "");
			String[] splitByHashArr = value.split("##");
			String replaceVal = null;
			
			for (String jsonKey : jsonKeys) {
				list.add(jsonKey);
			}
			
			String str = null;
			
			for (int i=0;i< splitByHashArr.length;i++) {
				JSONObject jsonObject = new JSONObject();
			   for(int j=0;j<list.size()-1;j++) {	
					if(splitByHashArr[i].substring(splitByHashArr[i].indexOf(list.get(j+1))-1)!=null){
						replaceVal =  splitByHashArr[i].substring(splitByHashArr[i].indexOf(list.get(j)),splitByHashArr[i].indexOf(list.get(j+1))-1)!=null 
							      ? splitByHashArr[i].substring(splitByHashArr[i].indexOf(list.get(j)),splitByHashArr[i].indexOf(list.get(j+1))-1)
							      : "";				   	
					}
					     map.put(list.get(j).replace(".",""), replaceVal.replace(list.get(j), ""));
						 
					//last element
					if(list.get(j+1).equals("key:")) {
						replaceVal = splitByHashArr[i].substring(splitByHashArr[i].indexOf(jsonKeys[jsonKeys.length-1]))!=null
								     ? splitByHashArr[i].substring(splitByHashArr[i].indexOf(jsonKeys[jsonKeys.length-1]))
								     : "";
						map.put(list.get(j+1).replace(".",""),replaceVal.replace("key:", ""));
					}					
				}
				
				if(!map.containsKey("taska")) {
					map.put("Estimated Time To Recover", "");
				}for(Map.Entry<String, Object> mapVal : map.entrySet()) {
					jsonObject.put(mapVal.getKey(), mapVal.getValue());
				}
				jsonKeyList.add(jsonObject);
			}
			System.out.println(jsonKeyList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

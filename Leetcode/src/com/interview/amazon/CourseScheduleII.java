package com.interview.amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int[] findOrder(int numCourses, int[][] prerequisites) {
	        List<List<Integer>> list=new ArrayList<>();
	        int number=0;
	        int[] courses=new int[numCourses];
	        int[] coursesToReturn=new int[numCourses];
	        for(int i=0;i<numCourses;i++){
	            list.add(new ArrayList<>());
	        }

	        for(int[] course:prerequisites){
	            list.get(course[1]).add(course[0]);
	            courses[course[0]]++;
	        }
	        Queue<Integer> que=new LinkedList<>();

	        for(int i=0;i<numCourses;i++){
	            if(courses[i]==0){
	                que.add(i);
	            }
	        }
	        int i=0;
	        while(!que.isEmpty()){
	            int value=que.poll();
	            coursesToReturn[i++]=value;
	            number++;
	            for(int num:list.get(value)){
	                courses[num]--;
	                if(courses[num]==0){
	                    que.add(num);
	                }
	            }
	        }
	        if(number==numCourses){
	            return coursesToReturn;
	        }
	        return new int[0];
	    }

}

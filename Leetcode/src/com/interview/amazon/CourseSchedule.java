package com.interview.amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numCourses = 2;
		int[][] prerequisites = {{1,0}};
	}
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        int sizeOfCourses=prerequisites.length;
        int number=0;
        int[] courseArray=new int[numCourses];
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int[] courses:prerequisites){
            list.get(courses[1]).add(courses[0]);
            courseArray[courses[0]]++;
        }

        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(courseArray[i]==0){
                que.add(i);
            }
        }
        if(que.isEmpty()){
            return false;
        }
        while(!que.isEmpty()){
            number++;
            int value=que.poll();
            for(int n:list.get(value)){
                courseArray[n]--;
                if(courseArray[n]==0){
                    que.add(n);
                }
            }

        }
        return number==numCourses;
    }

}


//0(V+E) vertices and edges
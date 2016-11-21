/*simons*/
package com.mypackage;

import java.util.Scanner;

public class MaxNoMirrors {
	Scanner scanner=null;
	private Integer diaSpace=null;
	Integer indexI=null;
	Integer indexJ=null;
	private Integer[][] space=null;
	Integer count=0;
	
	public MaxNoMirrors() {
		super();
		scanner=new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
	MaxNoMirrors maxNoMirrors=new MaxNoMirrors();
	maxNoMirrors.readSpace();
	maxNoMirrors.findMirrors();
	maxNoMirrors.printSpace();
}
	private void findMirrors() {
		// TODO Auto-generated method stub
		for(indexI=0;indexI<diaSpace;indexI++){
			checkColumn(indexI,diaSpace-1);
		}
		System.out.println("mirrors = "+count);
	}
	private void checkColumn(Integer indexI2,Integer indexI3) {
		// TODO Auto-generated method stub
		if(indexI3<0){
			return;
		}
		else if(space[indexI3][indexI2]==1){
		  return;
		}
		else{
			checkRow(indexI3,diaSpace-1);
			checkColumn(indexI2, indexI3-1);
		}
	}
	private void checkRow(Integer indexI4,Integer indexI5) {
		// TODO Auto-generated method stub
		if(indexI5==diaSpace){
			count++;
			return;
		}
		else if(space[indexI4][indexI5]==1){
			return;
		}
		else{
			checkRow(indexI4, indexI5+1);
		}
	}
	private void readSpace() {
		// TODO Auto-generated method stub
		System.out.println("diamension ?");
		diaSpace=scanner.nextInt();
		space=new Integer[diaSpace][diaSpace];
		readBlocks();
	}
	private void printSpace() {
		// TODO Auto-generated method stub
		for(indexI=0;indexI<diaSpace;indexI++){
			for(indexJ=0;indexJ<diaSpace;indexJ++){
				System.out.print("\t"+space[indexI][indexJ]);
			}
			System.out.println();
		}
	}
	private void readBlocks() {
		// TODO Auto-generated method stub
		System.out.println("values ?");
		for(indexI=0;indexI<diaSpace;indexI++){
			for(indexJ=0;indexJ<diaSpace;indexJ++){
				space[indexI][indexJ]=scanner.nextInt();
			}
		}
	}
}

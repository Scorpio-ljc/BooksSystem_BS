package com.ljc.util;

import java.util.List;

//��ҳ��
public class PageBean<T> {
	private int count;//������
	private int currentPage=1;//��ǰҳ��
	private int countOfPage=2;//һҳ������
	private int allPages;//��ҳ��
	private List<T> data;//��ǰҳ������
	public  PageBean(int count){
		this.count=count;
		if(count%countOfPage==0){
			this.allPages=count / countOfPage;
		}else{
			this.allPages=count / countOfPage + 1;
		}
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
		if(currentPage<1){
			this.currentPage=1;
		}
		if(currentPage>allPages){
			this.currentPage=allPages;
		}
	}
	public int getCountOfPage() {
		return countOfPage;
	}
	public void setCountOfPage(int countOfPage) {
		this.countOfPage = countOfPage;
	}
	public int getAllPages() {
		return allPages;
	}
	public void setAllPages(int allPages) {
		this.allPages = allPages;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	
}

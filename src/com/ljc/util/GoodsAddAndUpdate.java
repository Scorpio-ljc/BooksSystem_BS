package com.ljc.util;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.ljc.background.model.Goods;
import com.ljc.background.service.impl.GoodsServiceImpl;
import com.ljc.background.service.intf.GoodsServiceIntf;

public class GoodsAddAndUpdate {
	public static boolean util(HttpServletRequest request,String s){
		GoodsServiceIntf  intf = new GoodsServiceImpl();
		//Ҫ�ȴ���FileItemFactory��
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload  sfu=new ServletFileUpload(factory);
		//���������ͬ��DiskFileUpload dfu=new DiskFileUpload()�����౻��������ȡ����;
		UUID uuid= UUID.randomUUID();
		UUID uuid1= UUID.randomUUID();
		String uid=uuid.toString();
		uid=uid.replaceAll("-","");
		String uid1=uuid1.toString();
		uid1=uid1.replaceAll("-","");
		String id="002";
		String gName="����";
		String type_id="002";
		String price="100";
		String amount="20";
		String remark="���";
		String small_pic="";
		String big_pic="";
		String path="E:/�ٶ��������ļ�/javaEE/1-20/day08_tomcat������/" +
				"day08_tomcat������/03.���Ϻ͹���/apache-tomcat-6.0.39/webapps" +
				"/MallSystem/goodsImg/";
		String path1=path+uid1;
		String path2=path+uid;
		try {
			List<FileItem> fileItem=sfu.parseRequest(request);
			for (FileItem fileItem2 : fileItem) {
				String name=fileItem2.getName();
				if(name!=null && !"".equals(name)){
					int i=name.indexOf(".");
					name=name.substring(i);
					if("sPic".equals(fileItem2.getFieldName())){
						small_pic=uid+name;
						fileItem2.write(new File(path2+name));
					}
					if("bPic".equals(fileItem2.getFieldName())){
						big_pic=uid1+name;
						fileItem2.write(new File(path1+name));
					}
				}else{
					if("gID".equals(fileItem2.getFieldName())){
						 id=fileItem2.getString();
					}
					if("gName".equals(fileItem2.getFieldName())){
						 gName=fileItem2.getString();
					}
					if("typeID".equals(fileItem2.getFieldName())){
						type_id=fileItem2.getString();
					}
					if("gPrice".equals(fileItem2.getFieldName())){
						price=fileItem2.getString();
					}
					if("gAmount".equals(fileItem2.getFieldName())){
						amount=fileItem2.getString();
					}
					if("gRemark".equals(fileItem2.getFieldName())){
						remark=fileItem2.getString();
					}
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double price1=0;
		int count=0;
		try{
			price1=Double.parseDouble(price);
			count=Integer.parseInt(amount);
		}catch (Exception e) {
			System.out.println("Goods�۸��������ת�����⣺"+e.getMessage());
		}
		Goods goods = new Goods(id, gName, type_id, price1, count, remark, small_pic, big_pic);
		boolean temp=false;
		if("add".equals(s)){
		 temp = intf.add(goods);
		}
		if("update".equals(s)){
			Goods g=intf.getGoods(goods);
			File f= new File(path+g.getSmall_pic());
			File f1= new File(path+g.getBig_pic());
			//Ҫͬʱɾ��������Ƭ����ɾ���ɹ���
			if(f.exists() && f1.exists() && f.delete() && f1.delete()){
				System.out.println("�޸ĳɹ���");
			}else{
				System.out.println("ԭͼƬɾ��ʧ�ܣ�");
			}
			temp=intf.updateGoods(goods);
			
		}
		return temp;
	}
}

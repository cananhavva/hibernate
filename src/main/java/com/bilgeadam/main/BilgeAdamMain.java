package com.bilgeadam.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.bilgeadam.controller.BilgeAdamController;
import com.bilgeadam.entity.BilgeAdamEntity;

// Session session = HibernateUtil.getSessionfactory().openSession();
// session.getTransaction().begin();
// session.persist(bilgeAdamEntity);
// session.getTransaction().commit();
// System.out.println("ekleme tamamdır\" + BilgeAdamController.class");

/*
 * S.O.L.I.D
 * Single Responsibility:tek sorumluluk anlamına geliyor.
 */
public class BilgeAdamMain {
	
	public static void main(String[] args) throws IOException {
		
		// BilgeAdamEntity bilgeAdamEntity = new BilgeAdamEntity();
		// bilgeAdamEntity.setEmail("bilgeadam44@bilge.adam.com.tr");
		// bilgeAdamEntity.setPassword("4525");
		// BilgeAdamController bilgeAdamController = new BilgeAdamController();
		// bilgeAdamController.create(bilgeAdamEntity);
		
		////////////////////////////////////////////////////////////////////////////
		String html = new String(Files.readAllBytes(Paths.get("bilgeadam.htm")));
		
		String css = new String(Files.readAllBytes(Paths.get("bilgeadam.css")));
		
		// Blob is for binary data (videos, images other)
		
		BilgeAdamEntity bilgeAdamEntity2 = new BilgeAdamEntity();
		bilgeAdamEntity2.setId(3);
		bilgeAdamEntity2.setEmail("bilgeadam44@bilge.adam.com.tr");
		bilgeAdamEntity2.setPassword("1111");
		bilgeAdamEntity2.setPrice(456.55);
		bilgeAdamEntity2.setSpecific("ekleme yapılıyor-2");
		bilgeAdamEntity2.setHtml(html);
		bilgeAdamEntity2.setCss(css);
		
		BilgeAdamController bilgeAdamController = new BilgeAdamController();
		
		bilgeAdamController.update(bilgeAdamEntity2);
		
	}
	
}
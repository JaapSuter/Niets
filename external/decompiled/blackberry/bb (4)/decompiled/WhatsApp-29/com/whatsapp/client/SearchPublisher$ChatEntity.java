// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-29.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class SearchPublisher$ChatEntity extends Object
implements net.rim.device.api.unifiedsearch.entity.SearchableEntity

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.SearchPublisher$ChatSearchable /*com.whatsapp.client.SearchPublisher$ChatSearchable*/  field_54122 ; // ofs = 54122 addr = 0)
	private net.rim.device.api.unifiedsearch.SearchFieldCriteriaList /*net.rim.device.api.unifiedsearch.SearchFieldCriteriaList*/  field_54126 ; // ofs = 54126 addr = 0)
	public String /*java.lang.String*/  _jid ; // ofs = 54130 addr = 0)
	private String /*java.lang.String*/  field_54134 ; // ofs = 54134 addr = 0)
	private String /*java.lang.String*/  field_54138 ; // ofs = 54138 addr = 0)
	private net.rim.device.api.ui.image.Image /*net.rim.device.api.ui.image.Image*/  field_54142 ; // ofs = 54142 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.SearchPublisher$ChatEntity, com.whatsapp.client.SearchPublisher$ChatSearchable, net.rim.device.api.ui.image.Image ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib net.rim.device.api.unifiedsearch.SearchFieldCriteriaList//net.rim.device.api.unifiedsearch.SearchFieldCriteriaList net.rim.device.api.unifiedsearch.SearchFieldCriteriaList net.rim.device.api.unifiedsearch.SearchFieldCriteriaList
	dup 
	invokespecial_lib net.rim.device.api.unifiedsearch.SearchFieldCriteriaList.<init> // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


public <init>( com.whatsapp.client.SearchPublisher$ChatEntity, module:WhatsApp-10.class#34, com.whatsapp.client.SearchPublisher$ChatSearchable, net.rim.device.api.ui.image.Image ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.client.SearchPublisher$ChatEntity.<init> // pc=3
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_6025 // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria//net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria
	dup 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aastore 
	invokespecial_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria.<init> // pc=3
	invokevirtual addCriteria( net.rim.device.api.unifiedsearch.SearchFieldCriteriaList, net.rim.device.api.unifiedsearch.SearchFieldCriteria ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria//net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria
	dup 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aastore 
	invokespecial_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria.<init> // pc=3
	invokevirtual addCriteria( net.rim.device.api.unifiedsearch.SearchFieldCriteriaList, net.rim.device.api.unifiedsearch.SearchFieldCriteria ) // pc=2
	return 
	}


public <init>( com.whatsapp.client.SearchPublisher$ChatEntity, module:WhatsApp-9.class#15, com.whatsapp.client.SearchPublisher$ChatSearchable, net.rim.device.api.ui.image.Image ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.client.SearchPublisher$ChatEntity.<init> // pc=3
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria//net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria
	dup 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aastore 
	invokespecial_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria.<init> // pc=3
	invokevirtual addCriteria( net.rim.device.api.unifiedsearch.SearchFieldCriteriaList, net.rim.device.api.unifiedsearch.SearchFieldCriteria ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.SearchPublisher$ChatEntity.routine_1823( com.whatsapp.client.SearchPublisher$ChatEntity ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.util.Enumeration getFieldCriteria( net.rim.device.api.unifiedsearch.SearchFieldCriteriaList ) // pc=1
	astore_1 
Label4:
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	ifeq Label15
	aload_1 
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	checkcast_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria//net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria
	astore_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	invokevirtual removeCriteria( net.rim.device.api.unifiedsearch.SearchFieldCriteriaList, net.rim.device.api.unifiedsearch.SearchFieldCriteria ) // pc=2
	goto Label4
Label15:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final updateName( com.whatsapp.client.SearchPublisher$ChatEntity, module:WhatsApp-10.class#34, net.rim.device.api.ui.image.Image ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.SearchPublisher$ChatEntity.routine_1823 // pc=1
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_6025 // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria//net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria
	dup 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aastore 
	invokespecial_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria.<init> // pc=3
	invokevirtual addCriteria( net.rim.device.api.unifiedsearch.SearchFieldCriteriaList, net.rim.device.api.unifiedsearch.SearchFieldCriteria ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria//net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria
	dup 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aastore 
	invokespecial_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria.<init> // pc=3
	invokevirtual addCriteria( net.rim.device.api.unifiedsearch.SearchFieldCriteriaList, net.rim.device.api.unifiedsearch.SearchFieldCriteria ) // pc=2
	aload_0 
	aload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


public final updateName( com.whatsapp.client.SearchPublisher$ChatEntity, module:WhatsApp-9.class#15, net.rim.device.api.ui.image.Image ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.SearchPublisher$ChatEntity.routine_1823 // pc=1
	aload_0 
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria//net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria net.rim.device.api.unifiedsearch.SearchFieldCriteria
	dup 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aastore 
	invokespecial_lib net.rim.device.api.unifiedsearch.SearchFieldCriteria.<init> // pc=3
	invokevirtual addCriteria( net.rim.device.api.unifiedsearch.SearchFieldCriteriaList, net.rim.device.api.unifiedsearch.SearchFieldCriteria ) // pc=2
	aload_0 
	aload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


public final java.lang.Object getData( com.whatsapp.client.SearchPublisher$ChatEntity ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public final net.rim.device.api.ui.image.Image getIcon( com.whatsapp.client.SearchPublisher$ChatEntity ); // address: 0
	{
	areturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final net.rim.device.api.unifiedsearch.SearchFieldCriteriaList getSearchCriteria( com.whatsapp.client.SearchPublisher$ChatEntity ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final net.rim.device.api.unifiedsearch.searchables.Searchable getSearchable( com.whatsapp.client.SearchPublisher$ChatEntity ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final java.lang.String getSummary( com.whatsapp.client.SearchPublisher$ChatEntity ); // address: 0
	{
	areturn_field .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public final long getTimeStamp( com.whatsapp.client.SearchPublisher$ChatEntity ); // address: 0
	{
	enter_narrow 
	iconst_0 
	i2l 
	lreturn 
	}


public final java.lang.String getTitle( com.whatsapp.client.SearchPublisher$ChatEntity ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final net.rim.device.api.unifiedsearch.action.UiAction getUiActions( com.whatsapp.client.SearchPublisher$ChatEntity, java.lang.Object, net.rim.device.api.unifiedsearch.action.UiAction[] ); // address: 0
	{
	enter_narrow 
	lipush 7927087837710325137
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	aconst_null 
	areturn 
	}

}

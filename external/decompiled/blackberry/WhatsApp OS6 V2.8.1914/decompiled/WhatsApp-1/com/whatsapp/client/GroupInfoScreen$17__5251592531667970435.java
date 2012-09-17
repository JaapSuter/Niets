// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 26
// ########################################################


package com.whatsapp.client;


abstract final class GroupInfoScreen$17 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.GroupInfoScreen /*com.whatsapp.client.GroupInfoScreen*/  field_56100 ; // ofs = 56100 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.GroupInfoScreen$17, com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.GroupInfoScreen$17 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _subjectField   // get_name_1:  _subjectField   // get_name_2:  _subjectField   // get_Name:    _subjectField   // getName->1:  _subjectField   // getName->2:  _subjectField   // getName->N:  _subjectField   // ofs = -1 ord = 1 addr = -1
	invokevirtual boolean isDirty( net.rim.device.api.ui.Field ) // pc=1
	ifne Label19
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 2 addr = -1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _subjectField   // get_name_1:  _subjectField   // get_name_2:  _subjectField   // get_Name:    _subjectField   // getName->1:  _subjectField   // getName->2:  _subjectField   // getName->N:  _subjectField   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual_lib .routine_199 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label19
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _subjectField   // get_name_1:  _subjectField   // get_name_2:  _subjectField   // get_Name:    _subjectField   // getName->1:  _subjectField   // getName->2:  _subjectField   // getName->N:  _subjectField   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 2 addr = -1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_229 // pc=2
Label19:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 2 addr = -1
	invokenonvirtual_lib .routine_457 // pc=1
	istore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _groupPhotoButton   // get_name_1:  _groupPhotoButton   // get_name_2:  _groupPhotoButton   // get_Name:    _groupPhotoButton   // getName->1:  _groupPhotoButton   // getName->2:  _groupPhotoButton   // getName->N:  _groupPhotoButton   // ofs = -1 ord = 3 addr = -1
	iload_1 
	ifeq Label30
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_1601 // pc=1
	goto Label32
Label30:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_1449 // pc=1
Label32:
	invokenonvirtual_lib .routine_2046 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _groupPhotoButton   // get_name_1:  _groupPhotoButton   // get_name_2:  _groupPhotoButton   // get_Name:    _groupPhotoButton   // getName->1:  _groupPhotoButton   // getName->2:  _groupPhotoButton   // getName->N:  _groupPhotoButton   // ofs = -1 ord = 3 addr = -1
	iload_1 
	ifne Label39
	iconst_1 
	goto Label40
Label39:
	iconst_0 
Label40:
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _groupPhotoButton   // get_name_1:  _groupPhotoButton   // get_name_2:  _groupPhotoButton   // get_Name:    _groupPhotoButton   // getName->1:  _groupPhotoButton   // getName->2:  _groupPhotoButton   // getName->N:  _groupPhotoButton   // ofs = -1 ord = 3 addr = -1
	invokenonvirtual_lib .routine_1857 // pc=1
	ifeq Label48
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _subjectField   // get_name_1:  _subjectField   // get_name_2:  _subjectField   // get_Name:    _subjectField   // getName->1:  _subjectField   // getName->2:  _subjectField   // getName->N:  _subjectField   // ofs = -1 ord = 1 addr = -1
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label48:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_3376 // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_1301 // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}

}

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="app" tagdir="/WEB-INF/tags" %>

<app:layout title="Category">
	<app:header icon="bi-plus" value="${param.id gt 0 ? 'Edit' : 'Add New' }"></app:header>
</app:layout>
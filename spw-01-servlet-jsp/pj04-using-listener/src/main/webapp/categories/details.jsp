<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="app" tagdir="/WEB-INF/tags"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<app:layout title="Category">

	<app:header icon="bi-tag" value="New Category"></app:header>

	<div class="row col">
		<app:form-group cssClass="col-auto" label="Status">
			<span class="form-control">Available</span>
		</app:form-group>

		<app:form-group cssClass="col-auto" label="Create At">
			<span class="form-control">2026-02-22</span>
		</app:form-group>

		<app:form-group cssClass="col-auto" label="Update At">
			<span class="form-control">-</span>
		</app:form-group>

		<div class="col btn-wrapper">
			<c:url var="edit" value="/categories/edit">
				<c:param name="id" value="1"></c:param>
			</c:url>
			<a href="${edit }" class="btn btn-outline-primary">Edit Category</a> <a
				href="" class="btn btn-outline-danger">Add Product</a> <a href=""
				class="btn btn-outline-danger">Upload Product</a>
		</div>

	</div>

	<div>
		<app:sub-header icon="bi-gift" value="Products in Category"></app:sub-header>

		<table class="table table-bordered mt-3">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Price</th>
					<th>Status</th>
					<th>Sales</th>
					<th>Remains</th>
					<th>Created At</th>
					<th>Updated At</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${products }">
					<tr>
						<td>1</td>
						<td>Cocacola</td>
						<td>25,000</td>
						<td>Available</td>
						<td>5</td>
						<td>20</td>
						<td>2024-10-12 10:00 AM</td>
						<td>2024-10-12 10:00 AM</td>
						<td><a href="" class="icon-link">See More</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>


</app:layout>

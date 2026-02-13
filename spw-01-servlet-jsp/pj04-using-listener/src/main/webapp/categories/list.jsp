<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="app" tagdir="/WEB-INF/tags"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<app:layout title="Category">

	<app:header icon="bi-tages" value="Category Management"></app:header>

	<!-- Search Form -->
	<form class="col row">

		<app:form-group cssClass="col-auto" label="Status">
			<select name="status" id="status" class="form-select">
				<option value="-">All</option>
				<option value="Available">Available</option>
				<option value="Deleted">Deleted</option>
			</select>
		</app:form-group>

		<app:form-group cssClass="col-auto" label="Product Name">
			<input type="text" class="form-control" placeholder="Search Name" />
		</app:form-group>

		<app:form-group cssClass="col-auto" label="From">
			<input type="date" class="form-control" />
		</app:form-group>

		<app:form-group cssClass="col-auto" label="To">
			<input type="date" class="form-control" />
		</app:form-group>

		<div class="col btn-wrapper">
			<button type="submit" class="btn btn-outline-primary">Search</button>
			
			<a type="submit" class="btn btn-outline-danger" href="${root }/categories/details">Add New Category</a>
		</div>

	</form>


	<!-- Result Table -->
	<table class="table table-bordered table-hovered mt-3">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Status</th>
				<th>Products</th>
				<th>Sales</th>
				<th>Created At</th>
				<th>Updated At</th>
				<th></th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="item" items="${list}">
				<tr>
					<td>101</td>
					<td>Stellar Electronics</td>
					<td>Active</td>
					<td>142</td>
					<td>$12,450.00</td>
					<td>2023-11-15</td>
					<td>2024-01-10</td>
					<td>
						<a href="${root }/categories/edit" class="icon-link">
							Edit
						</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>


</app:layout>
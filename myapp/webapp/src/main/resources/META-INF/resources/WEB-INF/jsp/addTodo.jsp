<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<h1>Enter To-do Details</h1>
	<form:form method="post" modelAttribute="todo">
	<fieldset class="mb-3">
	<form:label path="description">Description</form:label>
	<form:input type="text" path="description" required="required"/><br>
	<form:errors path="description" cssClass="text-warning"></form:errors><br/>
	</fieldset>
	<fieldset class="mb-3">
	<form:label path="targetDate">targetDate</form:label>
	<form:input type="text" path="targetDate" required="required"/><br>
	<form:errors path="targetDate" cssClass="text-warning"></form:errors><br/>
	</fieldset>
	
	<form:input type="hidden" path="id"/>
	<form:input type="hidden" path="done"/>
	
	<input type="submit" class="btn btn-success"></input>
	</form:form>
</div>

<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">$('#targetDate').datepicker({
	format:'yyyy-mm-dd',
	startDate:'-3d'});</script>
<%@ include file="common/footer.jspf" %>

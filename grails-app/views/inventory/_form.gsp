<%@ page import="testapp.Inventory" %>



<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'adminName', 'error')} required">
	<label for="adminName">
		<g:message code="inventory.adminName.label" default="Admin Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="adminName" name="adminName.id" from="${testapp.Admin.list()}" optionKey="id" required="" value="${inventoryInstance?.adminName?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'albums', 'error')} ">
	<label for="albums">
		<g:message code="inventory.albums.label" default="Albums" />
		
	</label>
	<g:select name="albums" from="${testapp.Album.list()}" multiple="multiple" optionKey="id" size="5" value="${inventoryInstance?.albums*.id}" class="many-to-many"/>
</div>


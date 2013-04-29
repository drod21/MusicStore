<%@ page import="testapp.ShoppingCart" %>



<div class="fieldcontain ${hasErrors(bean: shoppingCartInstance, field: 'albums', 'error')} ">
	<label for="albums">
		<g:message code="shoppingCart.albums.label" default="Albums" />
		
	</label>
	<g:select name="albums" from="${testapp.Album.list()}" multiple="multiple" optionKey="id" size="5" value="${shoppingCartInstance?.albums*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shoppingCartInstance, field: 'user', 'error')} required">
	<label for="user">
		<g:message code="shoppingCart.user.label" default="User" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="user" name="user.id" from="${testapp.User.list()}" optionKey="id" required="" value="${shoppingCartInstance?.user?.id}" class="many-to-one"/>
</div>


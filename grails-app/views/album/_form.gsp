<%@ page import="testapp.Album" %>



<div class="fieldcontain ${hasErrors(bean: albumInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="album.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" required="" value="${albumInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: albumInstance, field: 'year', 'error')} required">
	<label for="year">
		<g:message code="album.year.label" default="Year" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="year" from="${1900..2100}" class="range" required="" value="${fieldValue(bean: albumInstance, field: 'year')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: albumInstance, field: 'price', 'error')} required">
	<label for="price">
		<g:message code="album.price.label" default="Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="price" from="${9.99..19.99}" class="range" required="" value="${fieldValue(bean: albumInstance, field: 'price')}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: albumInstance, field: 'artist', 'error')} required">
	<label for="artist">
		<g:message code="album.artist.label" default="Artist" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="artist" name="artist.id" from="${testapp.Artist.list()}" optionKey="id" required="" value="${albumInstance?.artist?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: albumInstance, field: 'genre', 'error')} ">
	<label for="genre">
		<g:message code="album.genre.label" default="Genre" />
		
	</label>
	<g:textField name="genre" value="${albumInstance?.genre}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: albumInstance, field: 'songs', 'error')} ">
	<label for="songs">
		<g:message code="album.songs.label" default="Songs" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${albumInstance?.songs?}" var="s">
    <li><g:link controller="song" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="song" action="create" params="['album.id': albumInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'song.label', default: 'Song')])}</g:link>
</li>
</ul>

</div>


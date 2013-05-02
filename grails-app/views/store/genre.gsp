<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8">
		<meta name="layout" content="main">
		<title>Titan Music Store</title>
		<g:javascript library="prototype"></g:javascript>
	</head>
	<body id="body">
		<h1>Online Store</h1>

		<h2>Genre: ${genre.encodeAsHTML()}</h2>
		<table>
			<tr>
				<th>Artist</th>
				<th>Album</th>										
				<th>Year</th>															
			</tr>
			<g:each var="album" in="${albums}">
				<tr>
					<td>${album.artist.name}</td>
					<td><g:link action="show" controller="album" id="${album.id}">${album.title}</g:link></td>										
					<td>${album.year}</td>							
					<td><g:link controller="shoppingCart" action="addToCart" id="${album.id}">Add to cart</g:link></td>
				</tr>
			</g:each>
		
		</table>
		<div class="paginateButtons">
			<g:paginate controller="store" action="genre" params="[name:genre]" total="${totalAlbums}" />			
		</div>

		<div style="margin-top:10px">
			<g:link controller="store" action="shop">Back to Store</g:link>
		</div>
	</body>
	
</html>

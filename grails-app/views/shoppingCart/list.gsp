<html>
  <head>
    <meta name="layout" content="main">
  </head>
  <body>
    <div>
      <g:each in="${album?}">

        <span class="tag">${it.title}</span>
        <span class="tag">${it.price}</span>
        <g:link controller="shoppingCart" action="addToCart">Add to cart</g:link>

      </g:each>
    </div>
  </body>
</html

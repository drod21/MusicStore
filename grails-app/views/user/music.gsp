<html>
  <head>
    <meta name="layout" content="main">
    <title>${session?.user?.firstName}</title>
    <link rel="stylesheet" href="${createLinkTo(dir:'css',file:'main.css')}" />
    <link rel="shortcut icon" href="${createLinkTo(dir:'images',file:'favicon.ico')}" type="image/x-icon" />

    <link rel="stylesheet" href="${createLinkTo(dir:'css',file:'gtunes.css')}" type="text/css" media="screen" charset="utf-8">

  <g:javascript library="application" />	
</head>
<body>
  <h1>You have purchased the following songs:</h1>
  <p>Click a song to play it.</p>
<g:if test="${session.user}">
  <ul>
    <g:each in="${session.user.purchasedSongs}">
      <g:set var="title" value="${it.title}" />
      <g:set var="artist" value="${it.artist}" />
      <g:set var="fileLocation" value="${it.fileLocation}" />
      <li>
<g:link controller="store"
action="playSong"
params="[title:title, artist:artist, fileLocation:fileLocation]">${it.title}</g:link>
      </li>
    </g:each>
  </ul>
</g:if>

</html>

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
    <h1>gTunes Super Cereal Music Player</h1>
    <p>Song: ${params.title}<br />
      Artist: ${params.artist}</p>
      <audio controls>
        <source src="${params.fileLocation}" type="audio/mpeg">
      </audio>
    <p><g:link controller="user" action="music">Back to ${session.user.firstName}'s Library</g:link></p>

</html>


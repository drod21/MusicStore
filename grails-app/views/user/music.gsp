<html>
    <head>
	<meta name="layout" content="main">
        <title>${session?.user?.firstName}</title>
        <link rel="stylesheet" href="${createLinkTo(dir:'css',file:'main.css')}" />
        <link rel="shortcut icon" href="${createLinkTo(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
		<link rel="stylesheet" href="${createLinkTo(dir:'css',file:'gtunes.css')}" type="text/css" media="screen" charset="utf-8">
        <g:javascript library="scriptaculous" />			
        <g:javascript library="application" />	
    </head>

</html>

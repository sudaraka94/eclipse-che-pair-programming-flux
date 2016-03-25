# Eclipse Che:Pair programming

## This is a working protoype for Eclipse Che 4.0.0-RC9
Please note that this is not a completed project so llicense headers are not yet added. In order to build without any errors please skip license check
`mvn clean install -Dlicense.skip=true`

## Follow these steps to add this to Che(Add extention to assembly)
1. Build this extension using the above mentioned mvn command.
2. Add this into **assembly/assembly-ide-war/pom.xml**
3. Add the extension into **assembly/assembly-ide-war/src/main/resources/org/eclipse/che/ide/IDE.gwt.xml** by adding the following line
    `<inherits name='org.eclipse.che.ide.flux.liveedit.CheFluxLiveEditExtension' />`
4. Run Che using assembly.

## Import existing workspace into your Che
Use this to create your Che workspace https://gist.github.com/rnavagamuwa/8b825d4ea2408106e229










# DoConver


La siguiente es una aplicación de escritorio desarrollada en el lenguaje de programación de java bajo el paradigma de la programación orientada a objetos, cuyo principal objetivo es la conversión de ficheros en formato Microsoft a ficheros en formato abierto  (ODF Open Document Format) y viceversa y a formato PDF (Portable Document Format).

![Logo](https://i.ibb.co/9pFNcg6/LOGO-DOCONVER.png)

    
## Documentation

[Documentation](https://drive.google.com/drive/folders/1Mv2nTsDL2ATsxjFaTDsrfqQBHzdRjEIK?usp=sharing)

  
## Librerias

[Aspose](https://www.aspose.com/)

## Tecnología

[JavaFx](https://gluonhq.com/products/javafx/)

## Api

[DoConver Api](https://github.com/Arquitectura-de-software-UFPS-2021-2/Java-AppWeb.git)

## Herramientas 

[Launch4j](http://launch4j.sourceforge.net/)

## Requerimientos 

```
Es necesario tener instalada cualquier version de Java antes de la ejecucion de la aplicacion
```
    
## Screenshots

### Inicio
#### Vista principal del software.
![App Screenshot](https://i.ibb.co/17Y3VTp/Inicio.png)

### Carga de documento
#### Sube el documento que deseas convertir.
![App Screenshot](https://i.ibb.co/ChsP24z/Seleccion-de-documento.png)

### Configuracion
#### Elige el formato al que deseas convertir.
![App Screenshot](https://i.ibb.co/JRFtmQ0/Configuracion.png)

### Final
#### El formato deseado se descargara en tu escritorio
![App Screenshot](https://i.ibb.co/yYVLfS9/Resultado.png)

  
# Detalles de desarrollo

## Paquete doconver.util:

```https://apireference.aspose.com/pdf/java
Clase:  Variables.java

 Esta clase contiene todas las constantes de nuestro proyecto, los arreglos de las extensiones válidas por los diferentes tipos de archivos,
 ya que algunos admiten varios tipos de extensiones y el tipo de conversión, cuando es 0  se convertirá a PowerPoint, cuando es 1 a word y 2
 a excel ademas del metodo 

```

### variables

| Variable | Type     | Description                |
| :-------- | :------- | :------------------------- |
| ` NAME_PROJECT` | `String` | Representa el nombre de nuestro proyecto. |
| `DIR_DOWNLOAD` | `String` | Dirección del escritorio del usuario actual donde se guardará el archivo a descargar. |
| `EXT_WORD` | `String[]` | Extensiones validas por Word .docx|
| `EXT_EXCEL` | `String[]` | Extensiones validas por Excel .xlsx", ".xlsb", ".xlsm", ".xls", ".xlw  |
| `EXT_POWER_POINT` | `String[]` | Extensiones validas por Power Point .pptx |
| `EXT_PDF` | `String[]` | Extensiones validas por PDF .pdf  |
| `EXT_ODT` | `String[]` | Extensiones validas por ODT .odt |
| `EXT_ODS` | `String[]` | Extensiones validas por ODS .ods |
| `EXT_ODP` | `String[]` | Extensiones validas por ODP .odp |

| `MENU` | `iString[]` | Menu dinamico que contiene las opciones de los archivos que se pueden convertir "WORD", "EXCEL", "POWER POINT", "ODT", "ODS", "ODP" |
| `MENU_WORD` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de word - ODT, PDF |
| `MENU_EXCEL` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de Excel ODS, PDF |
| `MENU_POWER_POINT` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de Power Point - ODP, PDF  |
| `MENU_ODT` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de ODT - WORD, PDF |
| `MENU_ODS` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de ODS - EXCEL, PDF |
| `MENU_ODP` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de ODP - POWER POINT, PDF|
| `MENU_ITEMS` | `String[][]` |Matriz que contiene todos los menus |

### Metodos

#### pathOutFile()

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| ` pathOutFile` | `String` |Este metodo obtine la dirección del escritorio del usuario actual donde se guardará el archivo a descargar|


```https://apireference.aspose.com/pdf/java
Clase:  Validator.java

 Esta clase contiene todas las constantes de nuestro proyecto, los arreglos de las extensiones válidas por los diferentes tipos de archivos,
 ya que algunos admiten varios tipos de extensiones y el tipo de conversión, cuando es 0  se convertirá a PowerPoint, cuando es 1 a word y 2
 a excel ademas del metodo 

```
### Metodos

#### validate(String path, String[] exts)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `validate` | `boolean` |Valida el archivo mediante un arreglo de extensiones|

#### toChain(T[] exts)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `toChain` | `<T> String` |Convierte el contenido de un vector en cadena|

#### indexElement(String vector [], String element)
| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `indexElement` | `int` |Busca un valor dentro de un vector|


## Paquete doconver.controller:

```https://apireference.aspose.com/pdf/java
Clase:  Convert.java

 Clase intermediaria entre la conexion de la Api res doconver

```

### Metodos

#### to(String entry, String output, int extEntry, int extOutput)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `to` | `void` |tiene la logica desde la conexion con la api, hasta que almacena el archivo en el equipo|

#### save(String base64, String out, String name)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `save` | `void` |Guarda el archivo en la ruta especificada |



```https://apireference.aspose.com/pdf/java
Clase:  RequestController.java

 Realiza el formato del objeto que se va a enviar a la api como su respectiva conexion 

```

### Metodos

#### structure(FileModel model, String ext)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `structure` | `JSONObject` |Realiza la estructura del Objeto que se va a enviar a la api|

#### post(String url, JSONObject send)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `post` | `<T> JSONObject` |Logra la conexion con la Api y retorna la respuesta.|


## Paquete doconver.model :

```https://apireference.aspose.com/pdf/java
Clase:  FileModel.java

 Construye la estructura del archivo

```

#### toBase64()

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `toBase64` | `String` |Convierte un File a base64.|

```https://apireference.aspose.com/pdf/java
Clase:  RequestModel.java

 Construye la respuesta que se obtiene de la Api

```
#### RequestModel(JSONObject object)

| Nombre |  Description                |
| :-------- | :------------------------- |
| `RequestModel` |Constructor que recibe el objeto de respuesta|

## Paquete doconver.view :

 Este paquete está conformado por un total de dos clases que definen de manera clara y organizada cómo se van a mostrar los datos en la aplicación, adicional a esto se define el logo presente en la interfaz.

```https://apireference.aspose.com/pdf/java
Clase:  Doconverl.java

  En esta clase se genera el arranque de la aplicación bajo el método main y se construye la ventana de ejecución.  

```

| Method | Type     | Description                |
| :-------- | :------- | :------------------------- |
| start | `void` | Obtiene el inicio del archivo fxml, se crea la Scene y se le da las propiedades a la misma(Se pueda maximizar la ventana, serializable, agrega título e icono  y por último la muestra). |
| main | `void` | Ejecuta el método launch(args) la cual da inicio a la ejecución del programa.|



```https://apireference.aspose.com/pdf/java
Clase:  FileChooserSample.java

  Clase que cuyo objetivo es abrir y seleccionar los archivos a los cuales se les va a hacer la conversión.

```

| Method | Type     | Description                |
| :-------- | :------- | :------------------------- |
| start | `void` |Cuando se da click sobre el botón de seleccionar archivo desde el controller se llama a este método que lo que hace es abrir el explorador de archivos y cuando 	el usuario seleccione el archivo que desea convertir se ejecuta openButton.setOnAction el cual realiza las validaciones correspondientes si el archivo existe y si selecciono el archivo se ejecuta el método openFile quien lo abre y lo guarda. |
| openFile | `void` | El método start de la misma clase en su última instrucción hace un llamado a este método y este lo que hace es verificar que todo esté correcto, si es así se abre el documento de lo contrario se lanza una excepción |



## Paquete doconver.view.fxml :

```https://apireference.aspose.com/pdf/java
Clase:  FXMLDocumentController.java

  Controlador de la vista
```

| Method | Type     | Description                |
| :-------- | :------- | :------------------------- |
| init | `void` | Inicializa las variables de la vista |
| items | `void` | Crea los items del primer menú|
| submenú | `void` | Crea los items del segundo menu|
| handleButtonFileAction | `void` | Acción que se ejecuta al darle clik al botón de seleccionar archivo y lo que hace es abrir la ventana emergente para que el usuario seleccione el archivo y valida si el archivo fue seleccionado o no.|
| handleButtonConvertAction | `void` | Verifica que se tenga seleccionado un archivo, verifica la extensión elegida y verifica que la conversión sea correcta y se pueda realizar el proceso de conversión de lo contrario manda un mensaje de alerta con el mensaje correspondiente al error generado.|

```https://apireference.aspose.com/pdf/java
Clase:  FXMLDocument.fxml.java

 Vista de la aplicacion la cual se trabajó bajo la herramienta SceneBuilder mediante la cual se realizó el diseño del front y genero el archivo con la extensión .fxml la cual se conecta con el back end.
```
  
## Autores
#### Sergio Stives Barrios Buitrago - [@SerBuitrago](https://github.com/SerBuitrago)
#### Leyner Jose Ortega Arias - [@Leynerjoseoa](https://github.com/leynerjoseoa)
#### Yadir Alonso Garcia Quintero - [@yadirGarcia](https://github.com/yadirGarcia)
#### Soleimy Daniela Gomez Baron - [@soleimygomez](https://github.com/soleimygomez)



  
## Contribuyentes

¡Las contribuciones son siempre bienvenidas!

### Logotipo
#### Brayan Steven Caicedo Florez- [@BrayamFlorez](https://github.com/BrayamFlorez)

  

# DoConver


La siguiente es una aplicación de escritorio desarrollada en el lenguaje de programación de java bajo el paradigma de la programación orientada a objetos, cuyo principal objetivo es la conversión de ficheros en formato Microsoft a ficheros en formato abierto  (ODF Open Document Format) y viceversa y a formato PDF (Portable Document Format).

![Logo](https://i.ibb.co/9pFNcg6/LOGO-DOCONVER.png)

    
## Documentation

[Documentation](https://drive.google.com/drive/folders/1Mv2nTsDL2ATsxjFaTDsrfqQBHzdRjEIK?usp=sharing)

  
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

## Paquete APP:

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
| `TYPE_CONVERT` | `int` | Tipo de conversión, cuando es 0  se convertirá a PowerPoint |
| `TYPE_CONVERT_1` | `int` | Tipo de conversión, cuando es 1  se convertirá a Word |
| `TYPE_CONVERT_2` | `int` | Tipo de conversión, cuando es 2  se convertirá a Excel |
| `MENU` | `iString[]` | Menu dinamico que contiene las opciones de los archivos que se pueden convertir "WORD", "EXCEL", "POWER POINT", "ODT", "ODS", "ODP" |
| `MENU_WORD` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de word - ODT, PDF |
| `MENU_EXCEL` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de Excel ODS, PDF |
| `MENU_POWER_POINT` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de Power Point - ODP, PDF  |
| `MENU_ODT` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de ODT - WORD, PDF |
| `MENU_ODS` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de ODS - EXCEL, PDF |
| `MENU_ODP` | `String[]` |Contiene los tipos de archivos a los que se puede convertir un documento de ODP - POWER POINT, PDF|
| `MENU_ITEMS` | `String[][]` |Matriz que contiene todos los menus |

### Metodos

#### dirDownload()

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| ` dirDownload` | `String` |Este metodo obtine la dirección del escritorio del usuario actual donde se guardará el archivo a descargar|


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
| `validate` | `boolean` |Este metodo obtine la dirección del escritorio del usuario actual donde se guardará el archivo a descargar|

#### toChain(T[] exts)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `toChain` | `<T> String` |Este metodo obtine la dirección del escritorio del usuario actual donde se guardará el archivo a descargar|

#### name(String aux)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `name` | `String` |Este metodo obtine la dirección del escritorio del usuario actual donde se guardará el archivo a descargar|

#### indexElement(String vector [], String element)
| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `indexElement` | `int` |Este metodo obtine la dirección del escritorio del usuario actual donde se guardará el archivo a descargar|

```https://apireference.aspose.com/pdf/java
Clase:  Convert.java

 Esta clase es la que contiene los diferentes metodos de conversion para los diferentes tipos de archivo  

```

### Metodos

#### to(String entry, String out, int ext, int type, String ext_type)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `to` | `void` |este método recibe la ruta donde esta el archivo , la ruta donde se va a guardar, extensión del archivo que entra,  el tipo de archivo y extensión de salida. A partir de esto arma la ruta donde se va a guardar con su respectivo nombre y nueva extensión después decide en que archivo lo va a convertir dependiendo del tipo indicado usando un método de Aspose, que guarda el archivo en la salida con la extensión dada|

#### wordToPDF(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `wordToPDF` | `void` |Convierte un documento word a pdf |

#### wordToOdt(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `wordToOdt` | `void` |Convierte un documento word a odt |

#### OdtToWord(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `OdtToWord` | `void` |Convierte un documento odt a word|

#### odtToPDF(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `odtToPDF` | `void` |Convierte un documento odt a pdf|

#### excelToOds(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `excelToOds` | `void` |Convierte un documento excel a ods|

#### excelToPDF(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `excelToPDF` | `void` |Convierte un documento excel a pdf|

#### odsToExcel(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `odsToExcel` | `void` |Convierte un documento ods a excel|

#### odsToPDF(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `odsToPDF` | `void` |Convierte un documento ods a pdf|

#### powerPointToOdp(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `powerPointToOdp` | `void` |Convierte un documento power Point a odp|

#### powerPointToPDF(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `powerPointToPDF` | `void` |Convierte un documento power Point a pdf|

#### odpToPowerPoint(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `odpToPowerPoint` | `void` |Convierte un documento odp a power Point|

#### odptToPDF(String entry)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `odptToPDF` | `void` |Convierte un documento odp a pdf|


```https://apireference.aspose.com/pdf/java
Clase:  Validator.java

 Esta Clase valida los diferentes tipos de extenciones que admite cada tipo de documento 

```

### Metodos

#### validate(String path, String[] exts)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `validate` | `boolean` |Revisa si el tipo de archivo es valido, si existe en la ruta que se indico.

#### toChain(T[] exts)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `toChain` | `<T> String` |Imprimir una cadena, convierte el array que recibe en un array dinamico |

#### name(String aux)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `name` | `String` |Obtiene el nombre del archivo sin la extension|

#### indexElement(String vector [], String element)

| Nombre | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `indexElement` | `int` |Retorna el indice de la extension que se desea usar para el menu de extensiones dinamico|


## Paquete view:

 Este paquete está conformado por un total de dos clases que definen de manera clara y organizada cómo se van a mostrar los datos en la aplicación, adicional a esto se define el logo presente en la interfaz.



#### Class:Doconver


  En esta clase se genera el arranque de la aplicación bajo el método main y se construye la ventana de ejecución.  


| Method | Type     | Description                |
| :-------- | :------- | :------------------------- |
| start | `void` | Obtiene el inicio del archivo fxml, se crea la Scene y se le da las propiedades a la misma(Se pueda maximizar la ventana, serializable, agrega título e icono  y por último la muestra). |
| main | `void` | Ejecuta el método launch(args) la cual da inicio a la ejecución del programa.|





#### Class:FileChooserSample

  Clase que cuyo objetivo es abrir y seleccionar los archivos a los cuales se les va a hacer la conversión.



| Method | Type     | Description                |
| :-------- | :------- | :------------------------- |
| start | `void` |Cuando se da click sobre el botón de seleccionar archivo desde el controller se llama a este método que lo que hace es abrir el explorador de archivos y cuando 	el usuario seleccione el archivo que desea convertir se ejecuta openButton.setOnAction el cual realiza las validaciones correspondientes si el archivo existe y si selecciono el archivo se ejecuta el método openFile quien lo abre y lo guarda. |
| openFile | `void` | El método start de la misma clase en su última instrucción hace un llamado a este método y este lo que hace es verificar que todo esté correcto, si es así se abre el documento de lo contrario se lanza una excepción |





## Paquete controller:
##### Contiene una lógica que actualiza la vista en respuesta a las entradas de los usuarios de la aplicación.



#### Class: FXMLDocumentController

| Method | Type     | Description                |
| :-------- | :------- | :------------------------- |
| init | `void` | Inicializa las variables de la vista |
| items | `void` | Crea los items del primer menú|
| submenú | `void` | Crea los items del segundo menu|
| handleButtonFileAction | `void` | Acción que se ejecuta al darle clik al botón de seleccionar archivo y lo que hace es abrir la ventana emergente para que el usuario seleccione el archivo y valida si el archivo fue seleccionado o no.|
| handleButtonConvertAction | `void` | Verifica que se tenga seleccionado un archivo, verifica la extensión elegida y verifica que la conversión sea correcta y se pueda realizar el proceso de conversión de lo contrario manda un mensaje de alerta con el mensaje correspondiente al error generado.|

#### Herramienta Para empaquetar 

se utilizo Launch4j para empaquetar la aplicacion 

####  Se Necesita que este instalado java al momento de la instalacion 

#### Class:FXMLDocument.fxml

  Se trabajó bajo la herramienta SceneBuilder mediante la cual se realizó el diseño del front y genero el archivo con la extensión .fxml la cual se conecta con el back end.
## Autores
#### Sergio Stives Barrios Buitrago - [@SerBuitrago](https://github.com/SerBuitrago)
#### Leyner Jose Ortega Arias - [@Leynerjoseoa](https://github.com/leynerjoseoa)
#### Yadir Alonso Garcia Quintero - [@yadirGarcia](https://github.com/yadirGarcia)
#### Soleimy Daniela Gomez Baron - [@soleimygomez](https://github.com/soleimygomez)



  
## Contribuyentes

¡Las contribuciones son siempre bienvenidas!

### Logotipo
#### Brayan Steven Caicedo Florez- [@BrayamFlorez](https://github.com/BrayamFlorez)

  

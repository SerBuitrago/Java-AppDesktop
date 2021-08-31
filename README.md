
# DoConver


La siguiente es una aplicación de escritorio desarrollada en el lenguaje de programación de java bajo el paradigma de la programación orientada a objetos, cuyo principal objetivo es la conversión de ficheros en formato Microsoft a ficheros en formato abierto  (ODF Open Document Format) y viceversa y a formato PDF (Portable Document Format).

![Logo](https://i.ibb.co/9pFNcg6/LOGO-DOCONVER.png)

    
## Documentation

[Documentation](https://docs.google.com/document/d/1cMfrNrwhioXQIWRFuw_R7EJ6-RCj-VgQIx7KnFMXJXI/edit?usp=sharing)

  
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

  
## API Reference

#### Get all items

```https://apireference.aspose.com/pdf/java
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `outputLogFileName` | `string` | **Required**. Ruta al archivo donde se almacenarán los comentarios. |
| `format` | `int` | **Required**. El formato pdf. |
| `action` | `int` | **Required**. Acción para objetos que no se pueden convertir. |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### PdfFormatConversionOptions ( String  outputLogFileName, formato int, int action)

Toma la ruta donde se almacenara el archivo, el formato pdf, la acción para objetos a convertir y retorna un nuevo archivo con formato deseado

  
## Autores
#### Sergio Stives Barrios Buitrago - [@SerBuitrago](https://github.com/SerBuitrago)
#### Leyner Jose Ortega Arias - [@Leynerjoseoa](https://github.com/leynerjoseoa)
#### Yadir Alonso Garcia Quintero - [@yadirGarcia](https://github.com/yadirGarcia)
#### Soleimy Daniela Gomez Baron - [@soleimygomez](https://github.com/soleimygomez)



  
## Contribuyentes

¡Las contribuciones son siempre bienvenidas!

### Logotipo
#### Brayan Steven Caicedo Florez- [@BrayamFlorez](https://github.com/BrayamFlorez)

  
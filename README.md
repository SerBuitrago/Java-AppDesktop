
# DoConver

El siguiente software permitirá convertir archivos en formato Microsoft a formato abierto (ODF Open Document Format) y viceversa, y convertirlos a formato PDF (Portable Document Format)


![Logo](https://i.ibb.co/9pFNcg6/LOGO-DOCONVER.png)

    
## Documentation

[Documentation](https://linktodocumentation)

  
## Authors

- [@SerBuitrago](https://github.com/SerBuitrago)
- [@Leynerjoseoa](https://github.com/leynerjoseoa)
- [@yadirGarcia](https://github.com/yadirGarcia)
- [@soleimygomez](https://github.com/soleimygomez)

  
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

  
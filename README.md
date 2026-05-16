"# Programacion-movil-tarea" 
Tuve problemas a la hora de descargar las librerias y tratar de emular el codigo en mi computadora.
Es la razon por la cual tarde en subir todo a GitHub, mi pc se habia frezeado completamente varias veces.

Este documento analiza el código que define la interfaz principal de una aplicación Android desarrollada en Kotlin utilizando Jetpack Compose. El objetivo del código es mostrar un catálogo de dispositivos en una lista desplazable, aplicando los principios de diseño declarativo y gestión de estado propios de Compose.

1. MainActivity
La clase MainActivity es el punto de entrada de la aplicación. En Android, cada aplicación necesita al menos una actividad que actúe como controlador inicial.

onCreate:
Se ejecuta al iniciar la aplicación.
Configura la pantalla para que aproveche todo el espacio disponible utilizando enableEdgeToEdge, evitando que el contenido se superponga con la barra de estado o la cámara.
Define el contenido principal mediante setContent, que reemplaza el antiguo sistema basado en XML y habilita el uso de funciones de Compose.

Aplica el tema global PrimerAppTheme, que contiene colores, tipografías y estilos definidos para toda la aplicación.
Utiliza un Scaffold, un contenedor estructural que facilita la organización de la pantalla. Dentro de este Scaffold se renderiza la vista principal MainView.

Scaffold es el equivalente moderno a un "esqueleto de pantalla". Permite definir de forma coherente la estructura base de cada interfaz. (Similar a  body, section y div en HTML)

2. MainView (Vista principal)
La función MainView organiza los elementos visuales que el usuario observa utilizando:
Column: Es un contenedor que apila elementos de manera vertical.

Text("Catálogo"): Muestra el título principal. El Modifier aplicado define su estilo: separación (padding) y fondo verde.
LazyColumn: Es una lista que renderiza únicamente los elementos visibles en pantalla. Esto optimiza el rendimiento, especialmente con listas largas. Itera sobre una colección de objetos Device , cada elemento se delega a la función DeviceItemView, que define cómo se representa cada dispositivo.

3. GreetingPreview
Función de vista previa utilizada exclusivamente en el entorno de desarrollo.
@Preview: Indica a Android Studio que renderice la interfaz en el panel de diseño, sin necesidad de ejecutar el emulador. (Aun asi, me congelo la pc)

remember: Conserva valores en memoria durante la recomposición.
mutableStateOf: Contenedor observable que notifica a Compose cuando los datos cambian, provocando una actualización automática de la interfaz.

listOf: Crea una lista de objetos para simular datos de prueba.

Conclusión
El código establece una base sólida para una aplicación Android moderna con Jetpack Compose. La arquitectura declarativa está correctamente planteada:

MainActivity gestiona la entrada y aplica el tema.

MainView organiza la interfaz principal.

LazyColumn optimiza la lista de dispositivos.

DeviceItemView será el componente clave para mostrar cada elemento.

GreetingPreview facilita la iteración visual durante el desarrollo.

Aclaracion: 
No pude terminar el curso a tiempo ni subir todo al repositorio porque mi computadora se congelo multiples veces al tratar de usar el emulador y preview, por lo mismo, soy consciente de errores que puedan existir en el codigo, el hecho de que faltaron 2 puntos del curso y de la entrega tardia de la tarea.

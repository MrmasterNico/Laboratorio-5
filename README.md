# Laboratorio-5
Objetivo de la Actividad
Desarrollar en los estudiantes la capacidad de aplicar los principios de la Programación Orientada a Objetos 
(POO) en un contexto real de análisis de datos de pacientes con cáncer, mediante la identificación y 
descomposición modular de objetos, atributos, métodos y relaciones entre clases, para luego representar la 
solución en un diagrama de clases UML e implementarla en el lenguaje de programación Java, fortaleciendo así 
sus competencias en abstracción, modelado y construcción de software orientado a objetos.
Ejercicio a desarrollar.
Un hospital universitario quiere desarrollar un sistema que le permita gestionar y analizar la información de 
pacientes con cáncer. El objetivo es organizar los datos clínicos y realizar cálculos básicos que apoyen la toma de 
decisiones médicas. Los pacientes pacientes se registran en el hospital con los siguientes datos: Identificación del 
paciente, nombre, edad, genero, tipo de cáncer (sarcoma, Leucemia, Linfoma), etapa y estado actual (ej.: en 
tratamiento, en remisión, fallecido). Los pacientes cuentan con historial de tratamientos y resultados de 
exámenes. Los exámenes son registrados para cada paciente y cuentan con los siguientes datos: identificación 
del examen, fecha del examen, tipo de examen (ej.: resonancia, biopsia, tomografía) y un resultado. Los 
exámenes se asocian a un paciente y pueden ser consultados en su historial. Un paciente puede recibir distintos 
tratamientos: Quimioterapia, Radioterapia, Cirugía o Inmunoterapia, cada tratamiento tiene datos asociados 
como: identificación del tratamiento, nombre del tratamiento, duración en días, efectos secundarios y un método 
para calcular su eficacia (porcentaje estimado de mejora en función del tipo de cáncer).
Requerimientos del sistema.
El sistema debe poder generar estadísticas simples, como:
1. Número de pacientes por tipo de cáncer.
2. Porcentaje de pacientes en cada estado (remisión, en tratamiento, fallecido).
3. El sistema debe permitir registrar pacientes, agregar nuevos exámenes y tratamientos a los pacientes. 
Para probar el modelo de diseño diagrama UML.
1. Cree un proyecto Actividad4
2. Cree un paquete ejercicio1.
3. Dentro del paquete ejercicio1, implemente las clases con relaciones las cuales dan solución al problema.
4. Dentro del paquete ejercicio1, implemente una clase hospital y los siguientes métodos.
1. Método main()
Adicione 6 pacientes con diferente tipo de cáncer. 
Adicione dos exámenes a tres (3) pacientes. 
Adicione dos tratamientos a tres (3) pacientes.
Muestre en la consola cuantos paciente están registrados en el hospital por tipo de cáncer.
Muestre en la consola el porcentaje de pacientes en cada estado actual. 
 Tarea para cada equipo de trabajo conformado por dos estudiantes
1. Identificar los objetos principales y organizarlos en clases.
2. Definir sus atributos y métodos.
3. Establecer las relaciones entre clases.
4. Representar la solución en un diagrama de clases UML. 
5. Implementa la solución en lenguaje de programación java.
6. Pruebe la solución implementada

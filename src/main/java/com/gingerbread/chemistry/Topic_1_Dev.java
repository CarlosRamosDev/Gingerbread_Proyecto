package com.gingerbread.chemistry;

import java.util.Scanner;

public class Topic_1_Dev {
    public static void Dev(Scanner scanner) {
        Topic topic = new Topic();
        topic.setName("1.1 El átomo y sus partículas subatómicas");
        topic.setDescription("""
                Una Partícula Subatómicas es una partícula más pequeña que el átomo. Puede ser una partícula elemental o una compuesta, a su vez, por otras partículas subatómicas, como son los quarks, que componen los protones y neutrones.
                
                Estructura atómica:
                La idea de la existencia de átomos se remonta al año 500 A.C. porque ya Demócrata consideraba que la materia se componía de partículas indivisibles denominadas átomos.
                Pero el inicio real de la teoría atómica no tuvo lugar hasta fines del siglo XIX. El primer desarrollo sobre el átomo fue el de Dalton en su teoría atómica, la cual puede resumirse así: los átomos son las partículas básicas de la materia, pequeñas esferas compactas e indivisibles que son idénticas (misma masa y propiedades) para un mismo elemento, pudiéndose agrupar átomos de distintos elementos en relaciones sencillas para formar moléculas también compactas.
                Esta teoría explicaba las leyes de constancia de masa, constancia de composición, combinación en proporciones múltiples y recíprocas y muchas propiedades generales de la materia, pero al querer explicar ciertos fenómenos, surgía a necesidad de aceptar que los átomos debían ser más complicados de lo que se creía."""
        );
        topic.addSubtopic(new Topic("1.1.1 Rayos Catódicos y Rayos anódicos", """
                Los rayos catódicos:
                Los rayos catódicos son corrientes de electrones observados en tubos de vacío, es decir los tubos de cristal que se equipan por lo menos con dos electrodos, un cátodo y un ánodo en una configuración conocida como diodo. Cuando se calienta el cátodo, emite una cierta radiación que viaja hacia el ánodo.
                El primer experimento interesante que condujo a un modelo sobre la composición de los átomos, fue hecho por el físico inglés J. J. Thomson, entre los años 1898 a 1903, quién estudió la descarga eléctrica que se produce dentro de tubos al vacío parcial (algo de aire), llamados Tubos de rayos catódicos. El aire enrarecido sirve efectivamente para que, si alguna partícula pequeña se desplaza y choca una molécula de Nitrógeno u Oxígeno, se produzca una iluminación en la dirección del flujo de partículas de modo que pueda ser identificado. Thomson encontró que cuando un voltaje suficientemente alto (proveniente de una pila o bobina) era aplicado entre los electrodos como lo muestra la Figura, un rayo que el llamó rayos catódicos (porque comenzaba en el electrodo negativo de la pila), se producía. Este rayo viajaba hacia el electrodo (+) por lo que dedujo que se trataba de un flujo de partículas repelidas por el electrodo (-) que necesariamente significaba que eran partículas cargadas (-) atraídas por el electrodo (+) y que llamó desde entonces electrones e-.
                
                Rayos anódicos:
                Los rayos anódicos: también conocidos con el nombre de canales o positivos, son haces de rayos positivos construidos por cationes atómicos o moleculares que se desplazan hacia el electrodo negativo en un tubo de Crookes.
                Es un fenómeno químico-físico por el cual algunos cuerpos o elementos químicos, llamados radiactivos, emiten radiaciones que tienen la propiedad de impresionar placas radiográficas fecisterografias, ionizar gases, producir fluorescencia, atravesar cuerpos opacos a la luz ordinaria, entre otros.
                Descubrimiento del protón: Si se realiza la misma experiencia del tubo de descarga, pero con la modificación de que el cátodo esté perforado, tal como lo hiciera Goldstein en 1886, se observa que en la parte posterior del cátodo aparecen rayos luminosos llamados rayos anódicos ó canales. Experimentos posteriores demostraron que los rayos anódicos son partículas de carga positiva debido a su comportamiento frente a los campos eléctricos y magnéticos. Pero estos rayos NO se producen en el ánodo, sino que tienen su origen en el choque de los electrones de suficiente energía con los átomos neutros del gas contenido en el tubo a quienes arrancan nuevos electrones dejando partículas positivas residuales que se dirigen aceleradas al cátodo y algunas lo atraviesan. Estas partículas positivas se desvían en sentido inverso a los rayos catódicos frente a campos eléctricos y magnéticos. Midiendo la relación masa/carga se encontró que son mucho más pesadas que los electrones y que dependía del gas encerrado en el tubo."""
        ));
        topic.addSubtopic(new Topic("1.1.2 Radiactividad", """
                La radiactividad es una propiedad de los isotopos que son "inestables", es decir, que se mantienen en un estado excitado en sus capas electrónicas o nucleares, con lo que, para alcanzar su estado fundamental, deben perder energía.
                Es un fenómeno químico-físico por el cual algunos cuerpos o elementos químicos, llamados radiactivos, emiten radiaciones que tienen la propiedad de impresionar placas radiográficas fecisterografias, ionizar gases, producir fluorescencia, atravesar cuerpos opacos a la luz ordinaria, entre otros.
                Debido a esa capacidad, se les suele denominar radiaciones ionizantes.
                Las radiaciones emitidas pueden ser electromagnéticas, en forma de rayos X o rayos gamma, como pueden ser núcleos de helio, electrones, protones u otras. Fenómeno que ocurre en los núcleos de ciertos elementos, inestables, que son capaces de transformarse, o decaer, espontáneamente, en núcleos atómicos de otros elementos más estables. La radiactividad ioniza el medio que atraviesa. Una excepción lo constituye el neutrón, que no posee carga, pero ioniza la materia en forma indirecta. En las desintegraciones radiactivas se tienen varios tipos de radiación: alfa, beta, gamma y neutrones."""
        ));
        topic.menu(scanner);
    }
}

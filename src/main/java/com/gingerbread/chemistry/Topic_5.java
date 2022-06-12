package com.gingerbread.chemistry;

import com.gingerbread.common.Topic;

public class Topic_5 {
    public static Topic Topic() {
        Topic topic = new Topic();
        topic.setName("1.5 Distribución electrónica en sistemas poli electrónicos");
        topic.setDescription("""
                La ecuación de onda de Schrodinger no tiene solución exacta. Hay que introducir soluciones aproximadas: Los orbitales atómicos son semejantes a los del hidrógeno.
                También se pueden emplear los mismos números cuánticos (n, l, m l) para describir los orbitales Sistemas con más de 1 electrón, hay que tener en cuenta: Cuarto número cuántico (ms) Limitar nº electrones por orbital (P. Exclusión Pauli) Conjunto de niveles de energía más complejo La configuración electrónica de un átomo es la distribución de los electrones en los subniveles de energía del átomo. La configuración electrónica de un átomo se obtiene escribiendo en orden ascendente de energía los símbolos de los subniveles ocupados indicando el número de electrones que contiene.
                El número de electrones que ocupan los subniveles de un átomo neutral debe ser igual al número atómico del elemento.
                Para escribir la configuración electrónica de un átomo es necesario observar el principio de Aufbau, el cual establece que los electrones del átomo se van añadiendo a los subniveles en orden ascendente de energía. Es decir, cada electrón entra en el subnivel de menor energía disponible hasta que este nivel esté lleno, entonces el próximo electrón entra en el subnivel que le sigue en energía. El arreglo así obtenido corresponde al estado de más baja energía posible del átomo y se conoce como el estado raso. Cualquier otro arreglo de los electrones produce un estado de mayor energía y se le llama, en este caso, estado excitado.\s"""
        );

        topic.addSubtopic(new Topic("1.5.1 Principio de Aufbau o de construcción", """
                El principio de Aufbau contiene una serie de instrucciones relacionadas a la ubicación de electrones en los orbitales de un átomo. El modelo, formulado por el físico Niels Bohr, recibió el nombre de Aufbau (del alemán Aufbauprinzip: principio de construcción) en vez del nombre del científico. También se conoce popularmente con el nombre de regla del serrucho.
                Los orbitales se 'llenan' respetando la regla de Hund, que dice que ningún orbital puede tener dos orientaciones del giro del electrón sin antes de que los restantes números cuánticos magnéticos de la misma subcapa tengan al menos uno. Se comienza con el orbital de menor energía. Primero debe llenarse el orbital 1s (hasta un máximo de dos electrones), esto de acuerdo con el número.
                Seguido se llena el orbital 2s (también con dos electrones como máximo).
                La subcapa 2p tiene tres orbitales degenerados en energía denominados, según su posición tridimensional, 2px, 2py, 2pz. Así, los tres orbitales 2p puede llenarse hasta con seis electrones, dos en cada uno. De nuevo, de acuerdo con la regla de Hund, deben tener todos por lo menos un electrón antes de que alguno llegue a tener dos.\s"""
        ));

        topic.addSubtopic(new Topic("1.5.2 Principio de exclusión de Pauli", """
                El principio de exclusión de Pauli es un principio cuántico enunciado por Wolfgang Ernst Paulien en 1925, que establece que no puede haber dos electrones con todos sus números cuánticos idénticos (esto es, en el mismo estado cuántico de partícula individual). Hoy en día no tiene el estatus de principio, ya que es derivable de supuestos más generales (de hecho, es una consecuencia del Teorema de la estadística del spin).\s
                Regla de exclusión de Pauli:
                Esta regla nos dice que en un estado cuántico sólo puede haber un electrón.\s
                También que en una orientación deben de caber dos electrones excepto cuando el número de electrones se ha acabado por lo cual el orden que debe de seguir este ordenamiento encada nivel es primero los de espín positivo (+1/2) y luego los negativos. Principio de Exclusión de Pauli: “Dos electrones del mismo átomo no pueden tener los mismos números cuánticos idénticos y por lo tanto un orbital no puede tener más de dos electrones”
                Esta regla establece que, por cada espacio o tipo de orbital, puede contener únicamente 2 electrones, y con spin contrario.
                Tienen que ser con spin contrario ya que Cargas iguales se repelen y cargas distintas se atraen."""
        ));

        topic.addSubtopic(new Topic("1.5.3 Principio de máxima multiplicidad de Hund", """
                La regla de Hund es una regla empírica obtenida por Friedich Hund en el estudio de los aspectos atómicos que enuncia lo siguiente: Al llenar por lámpara orbitales de igual energía.
                Los electrones se distribuyen, siempre que sea posible, con sus opiniones paralelas, es decir, que no se cruzan. La partícula mini atómica es mas estable (tiene menos energía) cuando tiene electrones desapareados, que cuando esos electrones están apareados.
                También se denomina así a la regla de máxima multiplicidad de Hund: Cuando varios electrones están descritos por órbitas degenerados, la mayor Estabilidad energética es aquella en donde los spines electrónicos están separados. Para entender la regla de hund hay que saber que todas las orbitales en una subcapa deben estar ocupados por lo menos por un electrón antes de que se asigne un segundo."""
        ));

        topic.addSubtopic(new Topic("1.5.4 Configuración electrónica de los elementos y su ubicación en la clasificación periódica", """
                La configuración electrónica (o periódica) estamos es la descripción de la ubicación de los electrones en los distintos niveles (con subniveles y orbitales) de un determinado átomo.\s
                Configurar significa "ordenar" o "acomodar", y electrónico deriva de "electrón"; así, configuración electrónica es la manera ordenada de repartir los electrones en los niveles y subniveles de energía.\s
                Es la representación del modelo atómico de Schrödinger o modelo de la mecánica cuántica.
                Tipos de configuración electrónica Para graficar la configuración electrónica existen cuatro modalidades, con mayor o menor complejidad de comprensión, que son:
                Configuración estándar Se representa la configuración electrónica que se obtiene usando la regla de las diagonales. Es importante recordar que los orbitales se van llenando en el orden en que aparecen, siguiendo esas diagonales, empezando siempre por el 1s. Imagen 66. Aplicando la regla de las diagonales, la configuración electrónica para cualquier átomo, quedara como la siguiente representación dependiendo del elemento y su número atómico."""
        ));

        topic.addSubtopic(new Topic("1.5.5 Principios de Radiactividad", """
                Es el resultado de un cambio natural de un isotopo de un elemento hacia un isotopo de un elemento diferente. Las reacciones nucleares incluyen cambios en las partículas del núcleo de un átomo y por consiguiente causan un cambio en el átomo mismo. Todos los elementos más pesados que el bismuto (Bi) (y algunos más livianos) exhiben una radioactividad natural y por consiguiente pueden decaer en hacía elementos más livianos. Al contrario que las reacciones químicas normales que forman moléculas, las reacciones nucleares resultan en la transmutación de un elemento en un isotopo diferente o en un elemento diferente (recuerde que el número de protones de un átomo define el elemento, por lo tanto, un cambio de un protón resulta en un cambio de un átomo).
                Hay tres tipos comunes de radiación y cambios nucleares:
                La Radiación Alpha es la emisión de una partícula alpha del núcleo de un átomo. Una partícula α contiene 2 protones y 2 neutrones (y es similar a un núcleo He:) Cuando un átomo emite una partícula, la masa atómica del átomo disminuirá cuatro unidades (ya que 2 protones y 2 neutrones están perdidos) y el número atómico (z) disminuirá 2 unidades. Se dice que el elemento se 'transmuta' en otro elemento que es 2 z unidades más pequeño.
                La Radiación Beta (β) es la transmutación de un neutrón (seguido de la emisión de un electrón del núcleo del átomo:). Cuando un átomo emite una partícula β, la masa del átomo no cambiará (puesto que no hay cambio en el número total de
                La Radiación Gamma (g) incluye la emisión de energía electromagnética (similar a la energía proveniente de la luz) de un núcleo de un átomo. Ninguna partícula es emitida durante la radiación gamma, y por consiguiente la radiación gamma no causa en sí misma la transmutación de los átomos. Sin embargo, la radiación (g) es emitida generalmente durante, y simultáneamente, a la disminución radioactiva α o β Los rayos X, emitidos durante la disminución beta del cobalto-60, son un ejemplo común de la radiación gamma."""
        ));
        return topic;
    }

}

package com.gingerbread.chemistry;

public class Topic_3 {
    public static Topic Topic() {
        Topic topic = new Topic();
        topic.setName("1.3 Teoría atómica de Bohr");
        topic.setDescription("""
                El modelo de Bohr está basado en los siguientes postulados, que son válidos para átomos con un solo electrón como el hidrógeno y permitió explicar sus espectros de emisión y absorción.
                Postulados:
                1. Primer Postulado: Estabilidad del Electrón
                Un electrón en un átomo se mueve en una órbita circular alrededor del núcleo bajo la influencia de la atracción entre el electrón y el núcleo, obedeciendo las leyes de la mecánica clásica.
                Las únicas fuerzas que actúan sobre el electrón son las fuerzas de atracción eléctrica (Fa) y la fuerza centrípeta (Fc), que es exactamente igual a la fuerza centrífuga.
                2. Segundo Postulado: Orbitas o niveles permitidos
                En lugar de la infinidad de órbitas posibles en la mecánica clásica, para un electrón solo es posible moverse en una órbita para la cual el momento angular L es un múltiplo entero de la constante de Planck h.
                3. Tercer Postulado: Niveles Estacionarios de Energía
                Un electrón que se mueva en una de esas órbitas permitidas no irradia energía electromagnética, aunque está siendo acelerado constantemente por las fuerzas atractivas al núcleo. Por ello, su energía total permanece constante.
                4. Cuarto Postulado: Emisión y Absorción de Energía
                Si un electrón que inicialmente se mueve en una órbita de energía Ei cambia discontinuamente su movimiento de forma que pasa a otra órbita de energía Ef se emite o absorbe energía electromagnética para compensar el cambio de la energía total. La frecuencia ν de la radiación es igual a la cantidad (Ei – Ef) dividida por la constante de Planck h."""
        );
        topic.addSubtopic(new Topic("1.3.1 Teoría atómica de Bohr-Sommerfeld", """
                En 1916, el físico alemán Arnold Sommerfeld modificó el modelo de Bohr en el sentido que las órbitas permitidas para los electrones debían ser elípticas más que circulares.\s
                El modelo de Bohr - Sommerfeld es un buen ejemplo de un tipo de evolución de las teorías científicas: un modelo antiguo es modificado para incorporar y explicar datos nuevos.
                El modelo mecánico cuántico. La teoría de Bohr - Sommerfeld fue una pieza maestra de simplicidad, que explicó satisfactoriamente el espectro del hidrógeno. Sin embargo, tenía una contradicción fatal: funcionaba sólo con átomos de hidrógeno e iones que contenían sólo un electrón.
                Bohr supuso que el electrón sólo puede describir ciertas órbitas circulares alrededor del núcleo.
                El físico alemán Arnold Sommerfeld (1868-1951) completó este modelo atómico de Bohr considerando que las órbitas descritas no eran circulares, sino elípticas.
                En 1916, Sommerfeld perfeccionó el modelo atómico de Bohr intentando paliar los dos principales defectos de éste. Para eso introdujo dos modificaciones básicas: Órbitas casi-elípticas para los electrones y velocidades relativistas.
                La excentricidad de la órbita dio lugar a un nuevo número cuántico: el número cuántico azimutal, que determina la forma de los orbitales, se lo representa con la letra l y toma valores que van desde 0 hasta n-1.
                Las órbitas con:
                l = 0 se denominarían posteriormente orbitales "s" o Sharp
                l = 1 se denominarían "p" o principal.
                l = 2 se denominarían "d" o diffuse.
                l = 3 se denominarían "f" o fundamental."""
        ));
        return topic;
    }
}


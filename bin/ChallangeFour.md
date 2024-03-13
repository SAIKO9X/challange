Quando ligo um interruptor pela primeira vez, uma lâmpada é ativada. 
Esta ação me fornece informações sobre o estado inicial de uma lâmpada específica. 
Desligar o interruptor em seguida impede que eu possa determinar qual interruptor está associado a essa lâmpada nesta primeira iteração.

Então para resolver o problema do Desafio 4 eu usaria a seguinte abordagem:

Em seguida, ligamos outro interruptor. Agora, duas ações distintas podem ocorrer:

1. Ligue um dos interruptores e aguarde alguns minutos.

2. Desligue esse interruptor e ligue outro interruptor.

3. Entre na sala com as lâmpadas e observe:

   - Se a lâmpada estiver acesa: isso indica que o segundo interruptor é o responsável pelo controle dessa lâmpada. Isso é evidente porque apenas um dos interruptores estava ativado no momento em que entramos na sala das lâmpadas.

   - Se a lâmpada estiver apagada: aqui entra o aspecto crucial da abordagem. Nesse caso, existem apenas dois interruptores restantes. Ao tocar na lâmpada, podemos determinar se ela está quente ou fria:
        - Se estiver quente, isso significa que o interruptor inicialmente ligado é o responsável pelo controle dessa lâmpada, pois aqueceu a lâmpada durante a primeira iteração.
        - Se estiver fria, isso indica que o interruptor que acabou de ser ligado é o responsável pelo controle dessa lâmpada, uma vez que foi o último a ser ativado e não teve tempo para aquecer a lâmpada.

Essa maneira requer apenas duas idas até uma das salas das lâmpadas e permite determinar qual interruptor controla cada lâmpada.
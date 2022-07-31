# pitest-test-mutator




Para visualizar o relatório de força dos testes, execute dentro da pasta do projeto

```mvn clean test```

Exemplo:
```
================================================================================
- Statistics
================================================================================
>> Line Coverage: 14/16 (88%)
>> Generated 18 mutations Killed 15 (83%)
>> Mutations with no coverage 0. Test strength 83%
>> Ran 23 tests (1.28 tests per mutation)
Enhanced functionality available at https://www.arcmutate.com/
[←[1;34mINFO←[m] ←[1m------------------------------------------------------------------------←[m
[←[1;34mINFO←[m] ←[1;32mBUILD SUCCESS←[m
[←[1;34mINFO←[m] ←[1m------------------------------------------------------------------------←[m
[←[1;34mINFO←[m] Total time:  6.476 s
[←[1;34mINFO←[m] Finished at: 2022-07-31T09:50:02-03:00
[←[1;34mINFO←[m] ←[1m------------------------------------------------------------------------←[m

```
Se quiser ver os detalhes de execução, basta abrir no navegador o html da pasta gerada pit-reports <br/>
![image](https://user-images.githubusercontent.com/3687713/182027298-399ec4a4-e3ba-4190-a0c9-b3341cab2f14.png)
![image](https://user-images.githubusercontent.com/3687713/182027376-1190b451-2119-4155-84b8-126cd645c90b.png)
Trecho exemplo da classe Calculo
![image](https://user-images.githubusercontent.com/3687713/182027412-7b6c34df-9730-4439-8082-2fafc728c13a.png)



Modelo de Domínio:
![image](https://github.com/user-attachments/assets/d1b3c0e2-281d-49bf-9c95-a78fe7f512dd)


Comandos:

- Para verificar o remanejamento da lista de jogos:
![Captura de tela 2025-05-25 103910](https://github.com/user-attachments/assets/4d37b0a4-48e7-401b-b0e0-3c67e5b468f3)

SELECT TB_BELONGING .*, TB_GAME.TITLE FROM TB_BELONGING 
INNER JOIN TB_GAME ON TB_GAME.ID = TB_BELONGING.GAME_ID
WHERE LIST_ID = 2
ORDER BY POSITION

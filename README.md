# hotel
Exercício Try-Catch Java OO

Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
novamente a reserva com os dados atualizados. O programa não deve aceitar dados
inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada

Exemplo_01:
ENTRADA:
Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019
Check-out date (dd/MM/yyyy): 26/09/2019

SAIDA:
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights

ENTRADA:
Enter data to update the reservation:
Check-in date (dd/MM/yyyy): 24/09/2019
Check-out date (dd/MM/yyyy): 29/09/2019

SAIDA:
Reservation: Room 8021, check-in: 24/09/2019, check-out: 29/09/2019, 5 nights

Exemplo_02:
ENTRADA:
Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019
Check-out date (dd/MM/yyyy): 21/09/2019

SAIDA:
Error in reservation: Check-out date must be after check-in date

Exemplo_03:
ENTRADA:
Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019
Check-out date (dd/MM/yyyy): 26/09/2019

SAIDA:
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights

ENTRADA:
Enter data to update the reservation:
Check-in date (dd/MM/yyyy): 24/09/2015
Check-out date (dd/MM/yyyy): 29/09/2015

SAIDA:
Error in reservation: Reservation dates for update must be future dates

Exemplo_04:
ENTRADA:
Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019
Check-out date (dd/MM/yyyy): 26/09/2019

SAIDA:
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights

ENTRADA: 
Enter data to update the reservation:
Check-in date (dd/MM/yyyy): 24/09/2020
Check-out date (dd/MM/yyyy): 22/09/2020

SAIDA:
Error in reservation: Check-out date must be after check-in date

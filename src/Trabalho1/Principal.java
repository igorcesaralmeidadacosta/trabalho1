/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

/**
 *
 * @author Igor César
 */
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Contas obj1;
        obj1 = new Contas();
        ContaPoupanca obj2;
        obj2= new ContaPoupanca();
        ContaEspecial obj3;
        obj3 = new ContaEspecial();
        int conta1;
        int conta2;
        int conta3;
        double saque;
        double deposito;
        double transfere;
        double reajuste;
        double util;
        int j= 0, q = 0;
        String[] opcao1 = {"Saque", "Depósito", "Transfência", "Reajustar", "Ver saldos", "sair"};
        String[] opcao2 = {"Confirmar", "Cancelar"};
        String[] opcao3 = {"Voltar"};

        JOptionPane.showMessageDialog(null, " Bem Vindo(a)!");

        do {
            obj1.setNome(JOptionPane.showInputDialog(null, "Digite o nome do titular da conta comum: ", "Nome do Titular Conta comum", JOptionPane.QUESTION_MESSAGE));
            obj1.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta comum: ", "Número da Conta comum", JOptionPane.QUESTION_MESSAGE)));
            obj1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo de conta comum (R$):", "Saldo Conta comum", JOptionPane.QUESTION_MESSAGE)));

            obj2.setNome(JOptionPane.showInputDialog(null, "Digite o nome do titular da conta poupança: ", "Nome do Titular Conta poupança", JOptionPane.QUESTION_MESSAGE));
            obj2.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta poupança: ", "Número da Conta poupanca", JOptionPane.QUESTION_MESSAGE)));
            obj2.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo de conta poupanca (R$):", "Saldo Conta poupanca", JOptionPane.QUESTION_MESSAGE)));

            obj3.setNome(JOptionPane.showInputDialog(null, "Digite o nome do titular da conta especial: ", "Nome do Titular Conta especial", JOptionPane.QUESTION_MESSAGE));
            obj3.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da conta especial: ", "Número da Conta especial", JOptionPane.QUESTION_MESSAGE)));
            obj3.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo de conta especial (R$):", "Saldo Conta especial", JOptionPane.QUESTION_MESSAGE)));
            obj3.limite = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite da Conta especial (R$):", "Limite do titular da conta especial", JOptionPane.QUESTION_MESSAGE)));
            reajuste = (Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a multa para conta especial (%): :", "Multa da Conta especial", JOptionPane.QUESTION_MESSAGE)));

            if ((obj1.getNumero() == obj2.getNumero()) || (obj1.getNumero() == obj3.getNumero()) || (obj2.getNumero() == obj3.getNumero()))
            {
                JOptionPane.showOptionDialog(null, "Número das contas iguais! Refaça o processo de cadastro.", "Contas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);
            }

        } while ((obj1.getNumero() == obj2.getNumero()) || (obj1.getNumero() == obj3.getNumero()) || (obj2.getNumero() == obj3.getNumero()));

        do {
            j = JOptionPane.showOptionDialog(null, "Selecione a opção desejada:", "Contas", JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao1, opcao1[0]);
            if (j == 0) {
                conta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Número da conta para saque:", "Saque", JOptionPane.QUESTION_MESSAGE));
                saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do saque (R$)", "Saque", JOptionPane.QUESTION_MESSAGE));
                if (conta1 == obj1.getNumero()) {

                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + obj1.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);
                    if (q == 0) {
                        if (saque > 0) {
                            if (obj1.getSaldo() >= saque) {

                                obj1.sacar(saque);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado com sucesso!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {

                                JOptionPane.showOptionDialog(null, "Saldo insuficiente!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                            }

                        } else {

                            JOptionPane.showOptionDialog(null, "Saque inválido", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    } else {

                        JOptionPane.showOptionDialog(null, "Saque cancelado", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }

                } else if (conta1 == obj2.getNumero()) {

                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + obj2.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);
                    if (q == 0) {
                        if (saque > 0) {
                            if (obj2.getSaldo() >= saque) {

                                obj2.sacar(saque);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado com sucesso!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {

                                JOptionPane.showOptionDialog(null, "Saldo insuficiente!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                            }

                        } else {

                            JOptionPane.showOptionDialog(null, "Saque inválido", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    } else {

                        JOptionPane.showOptionDialog(null, "Saque cancelado", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }
                } else if (conta1 == obj3.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + obj3.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);
                    if (q == 0) {
                        if (saque > 0) {
                            if (obj3.getSaldo() >= saque) {

                                obj3.sacar(saque);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado com sucesso!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3);

                            } else if (obj3.getSaldo() + obj3.limite > saque) {
                                obj3.sacar(saque);
                                obj3.descontar(reajuste);
                                q = JOptionPane.showOptionDialog(null, "saque efetuado usando cheque especial!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3);

                            } else {

                                JOptionPane.showOptionDialog(null, "Saldo insuficiente!", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                            }

                        } else {

                            JOptionPane.showOptionDialog(null, "Saque invàlido", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    } else {

                        JOptionPane.showOptionDialog(null, "Saque cancelado", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }

                } else {
                    JOptionPane.showOptionDialog(null, "Número da conta inexistente", "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                }

            }

            if (j == 1) {
                conta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da conta para deposito", " Depósito", JOptionPane.QUESTION_MESSAGE));
                deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do deposito(R$)", "Depósito", JOptionPane.QUESTION_MESSAGE));
                if (conta1 == obj1.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + obj1.getNome(), "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);

                    if (q == 0) {

                        if (deposito > 0) {
                            obj1.saldo = obj1.depositar(deposito);
                            JOptionPane.showOptionDialog(null, "Depósito efetuado com sucesso! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                        } else {
                            JOptionPane.showOptionDialog(null, "Depósito inválido! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }

                    } else {
                        JOptionPane.showOptionDialog(null, "Depósito cancelado\n! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }

                } else if (conta1 == obj2.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + obj2.getNome(), "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);

                    if (q == 0) {

                        if (deposito > 0) {
                            obj2.saldo = obj2.depositar(deposito);
                            JOptionPane.showOptionDialog(null, "Depósito efetuado com sucesso! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                        } else {
                            JOptionPane.showOptionDialog(null, "Depósito inválido! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }

                    } else {
                        JOptionPane.showOptionDialog(null, "Depósito cancelado\n! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }

                } else if (conta1 == obj3.getNumero()) {
                    q = JOptionPane.showOptionDialog(null, "Nome do titular da conta:\n" + obj1.getNome(), "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);

                    if (q == 0) {

                        if (deposito > 0) {
                            obj3.saldo = obj3.depositar(deposito);
                            JOptionPane.showOptionDialog(null, "Depósito efetuado com sucesso! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                        } else {
                            JOptionPane.showOptionDialog(null, "Depósito inválido! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }

                    } else {
                        JOptionPane.showOptionDialog(null, "Depósito cancelado\n! ", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                    }

                } else {
                    JOptionPane.showOptionDialog(null, "Número da conta inexistente!", "Depósito", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);
                }

            }
            if (j == 2) {
                conta2 = Integer.parseInt(JOptionPane.showInputDialog(null, " Número da conta que irá transferir: ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                conta3 = Integer.parseInt(JOptionPane.showInputDialog(null, " Número da conta que irá receber : ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                if ((conta2 == obj1.getNumero() || conta2 == obj2.getNumero() || conta2 == obj3.getNumero()) && (conta3 == obj1.getNumero() || conta3 == obj2.getNumero() || conta3 == obj3.getNumero())) {
                    if ((conta2 == obj1.getNumero()) && (conta3 == obj2.getNumero())) {
                        util = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares da conta:\n " + obj1.getNome() + "\n" + obj2.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);
                        if (q == 0) {
                            if (util > 0 && util <= obj1.saldo) {
                                obj1.saldo = obj1.saldo - util;
                                obj2.saldo = obj2.saldo + util;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);
                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excedeo saldo da conta de " + obj1.getNome() + ", N°" + obj1.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);
                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);
                        }

                    }
                    if ((conta2 == obj1.getNumero()) && (conta3 == obj3.getNumero())) {
                        util = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares da conta:\n " + obj1.getNome() + "\n" + obj3.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);

                        if (q == 0) {
                            if (util > 0 && util <= obj1.saldo) {
                                obj1.saldo = obj1.saldo - util;
                                obj3.saldo = obj3.saldo + util;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + obj1.getNome() + ", N°" + obj1.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    }
                    if ((conta2 == obj2.getNumero()) && (conta3 == obj1.getNumero())) {

                        util = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência(R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + obj2.getNome() + "\n" + obj1.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);
                        if (q == 0) {
                            if (util > 0 && util <= obj2.saldo) {
                                obj2.saldo = obj2.saldo - util;
                                obj1.saldo = obj1.saldo + util;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + obj2.getNome() + ", N°" + obj2.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    }
                    if ((conta2 == obj2.getNumero()) && (conta3 == obj2.getNumero())) {
                        util = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + obj2.getNome() + "\n" + obj3.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);

                        if (q == 0) {
                            if (util > 0 && util <= obj2.saldo) {
                                obj2.saldo = obj2.saldo - util;
                                obj3.saldo = obj3.saldo + util;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + obj2.getNome() + ", N°" + obj2.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    }
                    if ((conta2 == obj3.getNumero()) && (conta3 == obj1.getNumero())) {
                        util = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência (R$): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + obj3.getNome() + "\n" + obj1.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);

                        if (q == 0) {
                            if (util > 0 && util <= obj3.saldo) {
                                obj3.saldo = obj3.saldo - util;
                                obj1.saldo = obj1.saldo + util;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + obj3.getNome() + ", N°" + obj3.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    }
                    if ((conta2 == obj3.getNumero()) && (conta3 == obj2.getNumero())) {
                        util = Double.parseDouble(JOptionPane.showInputDialog(null, " Transferência de valor (R $): ", " Transferência ", JOptionPane.QUESTION_MESSAGE));
                        q = JOptionPane.showOptionDialog(null, "Nome dos titulares das conta:\n " + obj3.getNome() + "\n" + obj2.getNome(), "Saque", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcao2, opcao2[0]);

                        if (q == 0) {
                            if (util > 0 && util <= obj3.saldo) {
                                obj3.saldo = obj3.saldo - util;
                                obj2.saldo = obj2.saldo + util;
                                JOptionPane.showOptionDialog(null, "Transferência efetuada com sucesso!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            } else {
                                JOptionPane.showOptionDialog(null, "transferência invalida ou valor excede saldo da conta de " + obj3.getNome() + ", N°" + obj3.getNumero() + "!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                            }
                        } else {
                            JOptionPane.showOptionDialog(null, "Transferência cancelada!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                        }
                    }
                } else if (conta2 == conta3) {
                    JOptionPane.showOptionDialog(null, "Numeros das contas iguais!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                } else {
                    JOptionPane.showOptionDialog(null, "Numeros das contas diferente dos do cadastro!\n", "Transferência", JOptionPane.DEFAULT_OPTION, JOptionPane.OK_CANCEL_OPTION, null, opcao3, opcao3[0]);

                }
            }

            if (j == 3) {
                try {
                    transfere = Double.parseDouble(JOptionPane.showInputDialog(null, " Taxa de conversão para a conta poupança(%): ", " Lucro da Conta Poupança ", JOptionPane.QUESTION_MESSAGE));
                    obj2.saldo = obj2.reajustar(transfere);
                    JOptionPane.showOptionDialog(null, "Reajuste realizado com sucesso!\n", "Reajuste", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                } catch (NumberFormatException s) {
                    obj2.saldo = obj2.reajustar();
                    JOptionPane.showOptionDialog(null, "Reajuste realizado com sucesso!\n", "Reajuste", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao3, opcao3[0]);

                }
            }
            if (j == 4) {
                JOptionPane.showMessageDialog(null, "Saldo " + obj1.tipoConta() + "," + obj1.getNome() + ", N°" + obj1.getNumero() + ":\n " + obj1.saldo + " Reais\n Saldo " + obj2.tipoConta() + "," + obj2.getNome() + ", N°" + obj2.getNumero() + ":\n " + obj2.saldo + " Reais\n Saldo " + obj3.tipoConta() + "," + obj3.getNome() + ", N°" + obj3.getNumero() + ":\n " + obj3.saldo + " Reais");

            }
            if (j == 5) {
                System.exit(0);
            }
            q = 1;
        } while (q != 0);
    }
}

# Liskov Substitution Principle (LSP)

### Projeto refatorado de https://github.com/emerson-prof-carvalho/solid-lsp-violation.

#### Solução
- Foi criada a interface `Shape`, que define o método `getArea`. Tanto `Rectangle` quanto `Square` implementam `Shape`;
- Assim, `Square` e `Rectangle` têm suas próprias implementações para o cálculo da área. As duas classes não estão mais relacionadas por herança, o que resolve o problema da violação do LSP;
- Podemos tratar as duas formas como objetos do tipo `Shape`, garantindo que ambos respeitem o comportamento esperado ao calcular a área, sem alterar as propriedades corretas do programa.

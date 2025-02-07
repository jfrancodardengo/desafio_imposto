 <h1>Desafio: imposto Java</h1>

<p>Para calcular o imposto de renda que uma pessoa deve pagar, um país aplica as seguintes regras:</p>

<ol>
    <li>Imposto sobre salário: a pessoa paga
    imposto sobre seu salário conforme
    tabela abaixo
        <table>
            <tr>
                <td>Salário Mensal</td>
                <td>Imposto</td>
            </tr>
            <tr>
                <td>Abaixo de 3000 por mês</td>
                <td>Isento</td>
            </tr>
            <tr>
                <td>3000 até 5000 exclusive</td>
                <td>10%</td>
            </tr>
            <tr>
                <td>5000 ou acima</td>
                <td>20%</td>
            </tr>
        </table>
    </li>
    <li>Se a pessoa obteve renda com prestação de serviços, o imposto cobrado é de 15%.</li>
    <li>Se a pessoa obteve ganho de capital (imóveis, ações, etc.), o imposto cobrado é de 20%.</li>
    <li>A pessoa pode abater até 30% do seu imposto bruto devido com gastos médicos ou educacionais. Mas
se seus gastos médicos e educacionais forem abaixo desses 30%, apenas os gastos médicos e
educacionais podem ser abatidos.</li>
</ol>

<p>Fazer um programa para ler quanto a pessoa obteve de renda anual com salário, prestação de serviço e
ganho de capital. Leia também quando a pessoal teve de gastos médicos e educacionais no ano. Seu
programa deverá então produzir um relatório de imposto de renda dessa pessoa conforme exemplos.
Considere a renda mensal com salário como sendo a renda anual dividida por 12.</p>

<h2>Exemplo 1</h2>
<div>
    <p>Renda anual com salário: 48000.00</p>
    <p>Renda anual com prestação de serviço: 0.00</p>
    <p>Renda anual com ganho de capital: 800.00</p>
    <p>Gastos médicos: 400.00</p>
    <p>Gastos educacionais: 5400.00</p> <br>
    <p>RELATÓRIO DE IMPOSTO DE RENDA</p> <br>
    <p>CONSOLIDADO DE RENDA:</p>
    <p>Imposto sobre salário: 4800.00</p>
    <p>Imposto sobre serviços: 0.00</p>
    <p>Imposto sobre ganho de capital: 160.00</p> <br>
    <p>DEDUÇÕES:</p>
    <p>Máximo dedutível: 1488.00</p>
    <p>Gastos dedutíveis: 5800.00</p> <br>
    <p>RESUMO:</p>
    <p>Imposto bruto total: 4960.00</p>
    <p>Abatimento: 1488.00</p>
    <p>Imposto devido: 3472.00</p>
</div>

<h2>Exemplo 2</h2>
<div>
    <p>Renda anual com salário: 189000.00</p>
    <p>Renda anual com prestação de serviço: 55184.93</p>
    <p>Renda anual com ganho de capital: 20000.00</p>
    <p>Gastos médicos: 600.00</p>
    <p>Gastos educacionais: 7500.00</p> <br>
    <p>RELATÓRIO DE IMPOSTO DE RENDA</p> <br>
    <p>CONSOLIDADO DE RENDA:</p>
    <p>Imposto sobre salário: 37800.00</p>
    <p>Imposto sobre serviços: 8277.74</p>
    <p>Imposto sobre ganho de capital: 4000.00</p> <br>
    <p>DEDUÇÕES:</p>
    <p>Máximo dedutível: 15023.32</p>
    <p>Gastos dedutíveis: 8100.00</p> <br>
    <p>RESUMO:</p>
    <p>Imposto bruto total: 50077.74</p>
    <p>Abatimento: 8100.00</p>
    <p>Imposto devido: 41977.74</p>
</div>



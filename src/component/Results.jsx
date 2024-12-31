import {calculateInvestmentResults,formatter} from "../util/investment.js";

export default function Results({Intial,Annual,Expected,Duration}){
    const results = calculateInvestmentResults({
        initialInvestment: Intial,    // Map Intial to initialInvestment
        annualInvestment: Annual,    // Map Annual to annualInvestment
        expectedReturn: Expected,    // Map Expected to expectedReturn
        duration: Duration,          // Map Duration to duration
      });
         // console.log(Intial,Annual,Expected,Duration);
         console.log(results);
         const intailInvestments = results[0].valueEndOfYear-results[0].interest-results[0].annualInvestment;
    return <table id="result">
<thead>
    <tr>
        <th>Year</th>
        <th>investment value</th>
        <th>interest (year)</th>
        <th>total interest</th>
        <th>invested capital</th>
    </tr>
</thead>
<tbody>
    {results.map(yearly=>{
        const total = yearly.valueEndOfYear-yearly.annualInvestment*yearly.year-intailInvestments;
        const totalAmount = yearly.valueEndOfYear-total;
        return <tr key={yearly.year}>
            <td>{yearly.year}</td>
            <td>{formatter.format(yearly.valueEndOfYear)}</td>
            <td>{formatter.format(yearly.interest)}</td>
            <td>{formatter.format(total)}</td>
            <td>{formatter.format(totalAmount)}</td>
        </tr>
    })}
</tbody>
    </table>
}
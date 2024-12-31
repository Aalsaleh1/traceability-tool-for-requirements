//import { calculateInvestmentResults } from "./util/investment";
//{intial,annual,er,duration}

export default function({Intial,Annual,Expected,Duration,OnChng}){
   



    return(<section id="user-input">
    <div  className="input-group"> 
        <p><label>Intial Investment</label><input type="number" value={Intial} onChange={(e)=>OnChng("Intial",e.target.value)}  />
        </p>
        <p><label>Annual Investment</label><input type="number" value={Annual} onChange={(e)=>OnChng("Annual",e.target.value)} />
        </p></div>
        <div  className="input-group">
        <p><label>Expected return</label><input type="number" value={Expected} onChange={(e)=>OnChng("Expected",e.target.value)}/>
        </p>
        <p><label>Duration</label><input type="number" value={Duration}  onChange={(e)=>OnChng("Duration",e.target.value)}/>
        </p> </div>
   </section>);
}
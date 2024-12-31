import UserInput from "./component/UserInput.jsx"
import Header from "./component/Header.jsx";
import { useState } from "react";
import Results from "./component/Results.jsx";
function App() {
  const[Intial,setIntial] = useState(10000);
  const[Annual,setAnnual] = useState(1200);
  const[Expected,setExpected] = useState(6);
  const[Duration,setDuration] = useState(10);
  function handleValues(Field,newValue){
    if(Field==="Intial")
        setIntial(newValue);
    
    if(Field==="Annual")
        setAnnual(newValue);
    if(Field==="Expected")
        setExpected(newValue);
    if(Field==="Duration")
        setDuration(newValue);
    
    }
    const isValidInput = Duration>=1;
  return (
   <>
   <Header />
    <UserInput Intial={Intial} Annual={Annual} Expected={Expected} Duration={Duration} OnChng={handleValues}></UserInput>
    {isValidInput&&<Results Intial={Intial} Annual={Annual} Expected={Expected} Duration={Duration}></Results>}
    {!isValidInput&&<p>Please Enter Positive Duration number</p>}
    </>
   
  )
}

export default App

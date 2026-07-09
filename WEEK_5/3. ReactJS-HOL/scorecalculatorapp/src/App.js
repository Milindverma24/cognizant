import './App.css';

import { CalculateScore } from './Components/CalculateScore';

function App() {

  return (

    <div>

      <CalculateScore
        Name={"Steve"}
        School={"Maria Assumpta Convent School"}
        total={294}
        goal={3}
      />

    </div>

  );

}

export default App;
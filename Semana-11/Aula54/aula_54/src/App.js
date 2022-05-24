import './App.css';
import HelloWorldDIO from './components/HelloWorldDIO'
import HelloWorldDIOClass from './components/HelloWorldDIOClass';
import HelloWorldDev from './components/HelloWorldDev';

function App() {
  return (
    <div className="App">
      <HelloWorldDIO />
      <HelloWorldDIOClass />
      <HelloWorldDev name="Michael"/>
    </div>
  );
}

export default App;

function getPizza(event) {
        
    event.preventDefault();
    
    const data = new FormData(event.target);
    
    const formJSON = Object.fromEntries(data.entries());


    formJSON.taste = data.getAll('taste');
    
    const results = document.querySelector('pre');
    
    results.innerText = JSON.stringify(formJSON, null, 2);
}

const form = document.getElementById('formulario');

form.addEventListener('submit', getPizza);

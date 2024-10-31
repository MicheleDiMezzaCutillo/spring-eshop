// Gestione del form della newsletter
document.getElementById("newsletterForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Impedisce l'invio del form tradizionale

    // Raccoglie i dati dal form
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;

    // Prepara i dati per la richiesta
    const data = {
        name: name,
        email: email
    };

    // Fa la richiesta POST all'endpoint del controller
    fetch("/api/newsletter/register", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(data)
        })
        .then(response => response.text().then(text => {
            if (response.ok) {
                document.getElementById("message").innerHTML = `<p style="color: green;">${text}</p>`;
            } else {
                document.getElementById("message").innerHTML = `<p style="color: red;">${text}</p>`;
            }
        }))
        .catch(error => {
            document.getElementById("message").innerHTML = `<p style="color: red;">Errore durante l'invio dei dati: ${error.message}</p>`;
        });
});

// Gestione del form della newsletter
document.getElementById("newsletterForm2").addEventListener("submit", function(event) {
    event.preventDefault(); // Impedisce l'invio del form tradizionale

    // Raccoglie i dati dal form
    const name = document.getElementById("name2").value;
    const email = document.getElementById("email2").value;

    // Prepara i dati per la richiesta
    const data = {
        name: name,
        email: email
    };

    // Fa la richiesta POST all'endpoint del controller
    fetch("/api/newsletter/register", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(data)
        })
        .then(response => response.text().then(text => {
            if (response.ok) {
                document.getElementById("message2").innerHTML = `<p style="color: green;">${text}</p>`;
            } else {
                document.getElementById("message2").innerHTML = `<p style="color: red;">${text}</p>`;
            }
        }))
        .catch(error => {
            document.getElementById("message2").innerHTML = `<p style="color: red;">Errore durante l'invio dei dati: ${error.message}</p>`;
        });
});
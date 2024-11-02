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
                document.getElementById("message").innerHTML = `<div class="alert alert-success mt-3"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button><strong>${text}</strong></div>`;
            } else {
                document.getElementById("message").innerHTML = `<div class="alert alert-danger mt-3"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button><strong>${text}</strong></div>`;
            }
        }))
        .catch(error => {
            document.getElementById("message").innerHTML = `<div class="alert alert-danger mt-3"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button><strong>${error.message}</strong></div>`;
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
                document.getElementById("message2").innerHTML = `<div class="alert alert-success mt-3"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button><strong>${text}</strong></div>`;

            } else {
                document.getElementById("message2").innerHTML = `<div class="alert alert-danger mt-3"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button><strong>${text}</strong></div>`;
            }
        }))
        .catch(error => {
            document.getElementById("message2").innerHTML = `<div class="alert alert-danger mt-3"><button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button><strong>${error.message}</strong></div>`;
        });
});
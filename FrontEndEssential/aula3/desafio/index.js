document.addEventListener("DOMContentLoaded", () => {
    document.querySelector('button').onclick = () => {

        const input = document.querySelector('input')
        const span = document.querySelector('span')
        
        let n = Number.parseInt(input.value)

        if (n > 0) {
            const timer = setInterval(() => {
                if (n <= 0) { clearInterval(timer) }
    
                span.innerHTML = `<strong>${n--}</strong>`
            }, 1000)
        } else {
            span.innerHTML = '<strong>Por favor, insira um número inteiro positivo</strong>'
        }
    }
})

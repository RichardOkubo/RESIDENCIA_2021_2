document.addEventListener("DOMContentLoaded", () => {

    document.querySelector('button').onclick = () => {
        
        const [ inputX, inputY ] = document.querySelectorAll('input')

        const x = Number(inputX.value)
        const y = Number(inputY.value)

        document.querySelector('h1').innerHTML = x + y

        inputX.value = ''
        inputY.value = ''
    }
})
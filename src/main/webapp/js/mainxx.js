
let r = 1;

const switchDisabledRButton = (buttonToDisable) => {
  document.getElementById('r-coord-input').childNodes.forEach(rButton => {
    rButton.disabled = rButton === buttonToDisable;
  });
}

window.onload = () => {

  const plot = new Plot(1, points);
  document.getElementById('coords-form:r-coord-input-real').value = 1;

  document.getElementById('r-coord-input').childNodes.forEach(rButton => {
    rButton.addEventListener('click', (event) => {
      event.preventDefault();
      r = event.target.value;
      switchDisabledRButton(event.target);
      plot.r = r;
      document.getElementById('coords-form:r-coord-input-real').value = r;
    });
  });
}
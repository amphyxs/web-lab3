
let r = 1;

const switchDisabledRButton = (buttonToDisable) => {
  document.getElementById('r-coord-input').childNodes.forEach(rButton => {
    rButton.disabled = rButton === buttonToDisable;
  });
}

const getTableValues = (tableRows) => {
  return [...tableRows].map(row => row.innerText);
}

window.onload = () => {

  const xInTable = getTableValues(document.getElementsByClassName('table-x'));
  const yInTable = getTableValues(document.getElementsByClassName('table-y'));
  const rInTable = getTableValues(document.getElementsByClassName('table-r'));

  for (let i = 0; i < xInTable.length; i++) {
    addPoint(xInTable[i], yInTable[i], rInTable[i]);
  }

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
import { test } from '@playwright/test';
import { SearchFlight } from '../src/Pages/SearchFlight';

test.beforeEach(async ({ page }) => {
    await page.goto('https://www.despegar.com.co/vuelos/');
  
});


test(`Given estar en la pagina de vuelos despegar
When Ingresar informacion para el vuelo
Then se muestran muestran los vuelos buscados`, async ({ page }) => {
    const search = new  SearchFlight(page);
    await search.flightsearch();
});
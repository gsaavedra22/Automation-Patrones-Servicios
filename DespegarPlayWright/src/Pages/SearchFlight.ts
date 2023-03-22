import { Page } from "@playwright/test";
export class SearchFlight {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async flightsearch() {
        await this.page.locator('.login-incentive--close').click();
        await this.page.getByRole('textbox', { name: 'Ingresa desde dónde viajas' }).click();
        await this.page.getByRole('textbox', { name: 'Ingresa desde dónde viajas' }).clear();
        await this.page.keyboard.type('Bogo');
        await this.page.waitForTimeout(5000) 
        //await this.page.getByRole('textbox', { name: 'Ingresa desde dónde viajas' }).fill('Bogo');
        await this.page.getByText('Bogotá, Bogotá D.C., Colombia').click();

        await this.page.getByRole('textbox', { name: 'Ingresa hacia dónde viajas' }).click();
        //await this.page.getByRole('textbox', { name: 'Ingresa hacia dónde viajas' }).fill('carta');
        await this.page.keyboard.type('Cartagena');
        await this.page.waitForTimeout(5000)      
        await this.page.getByText('Cartagena de Indias, Bolívar, Colombia').click();           
        await this.page.getByRole('textbox', { name: 'Ida' }).click();
        await this.page.getByText('11').first().click();
        await this.page.getByRole('textbox', { name: 'Vuelta' }).click();
        await this.page.getByText('25', { exact: true }).first().click();
        await this.page.locator('.sbox5-passengers-distribution-container > .sbox5-3-input').first().click();
        await this.page.locator('xpath=(//*[@class="steppers-icon-right stepper__icon"])[1]').click();
        await this.page.locator('xpath=(//*[@class="steppers-icon-right stepper__icon"])[2]').click();
        await this.page.getByRole('combobox').first().selectOption('8');
        await this.page.locator('a').filter({ hasText: 'Aplicar' }).click();
        await this.page.getByRole('button', { name: 'Buscar' }).click();
        await this.page.waitForTimeout(5000)  
        //await this.page.getByText('Vuelos baratosDesde $ 2.100.902').click();
    }

}

// Based mostly on https://github.com/Uniswap/interface/blob/main/src/theme/index.tsx

interface Palette {
  primary1: string
  primary2: string
  primary3: string
  primaryText: string
  secondary1: string
  secondary2: string
  white: string
  black: string
  gray50: string
  gray100: string
  gray200: string
  gray400: string
  gray600: string
  blue: string
  green: string
  red: string
  yellow: string
  success: string
  warning: string
  error: string
}

export const colorsLight: Palette = {
  primary1: '#E8006F',
  primary2: '#FF8CC3',
  primary3: '#FF99C9',
  primaryText: '#D50066',
  secondary1: '#F6DDE8',
  secondary2: '#FDEAF1',
  white: '#FFFFFF',
  black: '#27252E',
  gray50: '#f2f2f2',
  gray100: '#e3e3e3',
  gray200: '#b8b8b8',
  gray400: '#858585',
  gray600: '#4f4f4f',
  blue: '#0068FC',
  green: '#007D35',
  red: '#DA2D2B',
  yellow: '#E3A507',
  success: '#007D35',
  warning: '#FF8F00',
  error: '#DF1F38',
}

export const colorsDark: Palette = {
  primary1: '#2172E5',
  primary2: '#3680E7',
  primary3: '#4D8FEA',
  primaryText: '#5090ea',
  secondary1: '#17000b26',
  secondary2: '#17000b26',
  white: '#FFFFFF',
  black: '#27252E',
  gray50: '#f2f2f2',
  gray100: '#e3e3e3',
  gray200: '#b8b8b8',
  gray400: '#858585',
  gray600: '#4f4f4f',
  blue: '#2172E5',
  green: '#27AE60',
  red: '#FF4343',
  yellow: '#E3A507',
  success: '#27AE60',
  warning: '#FF8F00',
  error: '#FD4040',
}
